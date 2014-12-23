package cn.ld.ddxq.controller.auther;

import cn.ld.ddxq.dto.RecieveMessage;
import cn.ld.ddxq.util.EncryptUtils;
import cn.ld.ddxq.util.JaxbBinder;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * 微信易信认证服务
 *
 * @author xjli
 */

@Controller
@RequestMapping("/sign")
public class AutherController {
    private Logger LOG = LoggerFactory.getLogger(AutherController.class);
    private final static String TOKERN = "ddxq";

    @ResponseBody
    @RequestMapping(value = "auther", method = RequestMethod.GET)
    public String autherGet(@RequestParam("timestamp") String timestamp,
                            @RequestParam("nonce") String nonce,
                            @RequestParam("echostr") String echostr,
                            @RequestParam("signature") String signature) {
        String[] strarray = new String[]{TOKERN, timestamp, nonce};
        LOG.info(signature + "==" + timestamp + "==" + nonce + "==" + echostr);

        Arrays.sort(strarray);
        StringBuilder content = new StringBuilder();
        for (String s : strarray) {
            content.append(s);
        }
        LOG.info("encryp result is:" + EncryptUtils.sha(content.toString()));
        if (EncryptUtils.sha(content.toString()).equals(signature)) {
            return echostr;
        }
        return null;

    }

    @RequestMapping(value = "auther", method = RequestMethod.POST)
    public void autherPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException {
        System.out.println(req.getRequestURL());
        String id = req.getParameter("id");
        InputStream is = req.getInputStream();

        ByteArrayOutputStream swapStream = new ByteArrayOutputStream();
        byte[] buff = new byte[1024]; // buff用于存放循环读取的临时数据
        int rc = 0;
        while ((rc = is.read(buff, 0, 1024)) > 0) {
            swapStream.write(buff, 0, rc);
        }
        String returnData = new String(swapStream.toByteArray(), "utf-8");
        JaxbBinder binder = new JaxbBinder(RecieveMessage.class);
        RecieveMessage rm = binder.fromXml(returnData);
        String result = null;
        result = dealData(rm, id);
        resp.getWriter().write(result);
        System.out.println("result:" + result);

        // 这里必须这样处理，微信或者易信服务器在没有收到响应时，会自己做处理
        if (StringUtils.isNotBlank(result)) {
            resp.getWriter().write(result);
            resp.getWriter().close();
        }

    }

    private String dealData(RecieveMessage rm, String id) {
        JaxbBinder binder = new JaxbBinder(RecieveMessage.class);
        RecieveMessage respData = null;
        if (org.apache.commons.lang.StringUtils.isBlank(id)) {
            respData = createResponse(rm, "text");
            respData.setContent("非法的账号");
            return binder.toXml(respData, "UTF-8");
        }
        return null;
    }


    private String dealDefault(String returnData, RecieveMessage rm) {
        JaxbBinder binder = new JaxbBinder(RecieveMessage.class);
        RecieveMessage message = createResponse(rm, "text");
        message.setContent(returnData);
        return binder.toXml(message, "utf-8");
    }


    public RecieveMessage createResponse(RecieveMessage rm, String type) {

        RecieveMessage respData = new RecieveMessage();
        respData.setCreateTime(System.currentTimeMillis());
        respData.setFromUserName(rm.getToUserName());
        respData.setToUserName(rm.getFromUserName());
        respData.setMsgType(type);
        return respData;
    }


}
