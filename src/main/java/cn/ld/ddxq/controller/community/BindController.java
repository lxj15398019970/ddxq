package cn.ld.ddxq.controller.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 绑定小区
 */

@Controller
@RequestMapping("/bind")
public class BindController {
    private Logger LOG = LoggerFactory.getLogger(BindController.class);


    /**
     * 进入绑定小区页面
     * @return
     */
    @RequestMapping(value = "input.shtml", method = RequestMethod.GET)
    public String bindInput() {
        return "bind";
    }


    /**
     * 绑定小区提交
     * @return
     */

    @ResponseBody
    @RequestMapping(value = "submit.shtml", method = RequestMethod.POST)
    public String submit() {

        String result = "";

        return result;
    }


}
