package cn.ld.ddxq.controller.community;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ddxq首页
 */

@Controller
@RequestMapping("/home")
public class HomeController {
    private Logger LOG = LoggerFactory.getLogger(HomeController.class);


    /**
     * 进入ddxq首页
     *
     * @return
     */
    @RequestMapping(value = "input.shtml", method = RequestMethod.GET)
    public String input() {
        return "home";
    }




}
