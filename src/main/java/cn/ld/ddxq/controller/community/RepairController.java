package cn.ld.ddxq.controller.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 服务报修
 */

@Controller
@RequestMapping("/repair")
public class RepairController {
    private Logger LOG = LoggerFactory.getLogger(RepairController.class);


    /**
     * 进入报修首页
     *
     * @return
     */
    @RequestMapping(value = "input.shtml", method = RequestMethod.GET)
    public String input() {
        return "repair";
    }


    /**
     * 报修详情首页
     *
     * @return
     */
    @RequestMapping(value = "repair-input.shtml", method = RequestMethod.GET)
    public String detail() {
        return "repair-detail-input";
    }


    /**
     * 进入发布报修首页
     *
     * @return
     */

    @RequestMapping(value = "publish-input.shtml", method = RequestMethod.GET)
    public String publishInput() {
        return "repair-publish-input";
    }


    /**
     * 发布报修
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "publish.shtml", method = RequestMethod.GET)
    public String publish() {

        String result = "";
        return result;

    }


}
