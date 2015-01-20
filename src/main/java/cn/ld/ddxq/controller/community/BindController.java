package cn.ld.ddxq.controller.community;

import cn.ld.ddxq.model.Community;
import cn.ld.ddxq.model.User;
import cn.ld.ddxq.model.UserHead;
import cn.ld.ddxq.service.ICommunityService;
import cn.ld.ddxq.service.IUserHeadService;
import cn.ld.ddxq.service.IUserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 绑定小区
 */

@Controller
@RequestMapping("/bind")
public class BindController {
    private final Logger LOG = LoggerFactory.getLogger(BindController.class);

    @Autowired
    private ICommunityService iCommunityService;

    @Autowired
    private IUserHeadService iUserHeadService;

    @Autowired
    private IUserService iUserService;

    /**
     * 进入绑定小区页面
     *
     * @return
     */
    @RequestMapping(value = "input.shtml", method = RequestMethod.GET)
    public String bindInput(Model model) {

        //获取所有可供选择的小区
        List<Community> communityList = iCommunityService.findAll();
        model.addAttribute("communityList", communityList);


        //获取所有的默认头像

        List<UserHead> userHeads = iUserHeadService.findAll();
        model.addAttribute("userHeads", userHeads);

        //绑定
        return "bind";
    }


    /**
     * 绑定小区提交
     *
     * @return
     */

    @RequestMapping(value = "submit.shtml", method = RequestMethod.POST)
    public String submit(User user) {


        iUserService.add(user);
        String result = "绑定成功";

        return "redirect:/home/input.shtml";
    }


//    /**
//     * 生成一个随机的名称
//     * @return
//     */
//    @ResponseBody
//    @RequestMapping(value = "randomUser.shtml", method = RequestMethod.POST)
//    public Object randomUser() {
//
//        String result = "";
//
//
//
//
//
//
//        return result;
//    }


}
