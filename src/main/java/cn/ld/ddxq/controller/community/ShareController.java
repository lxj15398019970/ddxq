package cn.ld.ddxq.controller.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 圈子首页
 */

@Controller
@RequestMapping("/share")
public class ShareController {
    private Logger LOG = LoggerFactory.getLogger(ShareController.class);


    /**
     * 进入圈子首页
     *
     * @return
     */
    @RequestMapping(value = "input.shtml", method = RequestMethod.GET)
    public String input() {
        return "share";
    }


    /**
     * 圈子详情首页
     *
     * @return
     */
    @RequestMapping(value = "deal-input.shtml", method = RequestMethod.GET)
    public String detail() {
        return "share-detail";
    }


    /**
     * 进入发布圈子首页
     *
     * @return
     */

    @RequestMapping(value = "publish-input.shtml", method = RequestMethod.GET)
    public String publishInput() {
        return "share-publish";
    }


    /**
     * 发布圈子
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
