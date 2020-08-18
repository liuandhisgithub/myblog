package com.liu.myblog.action;

import com.liu.myblog.entity.User;
import com.liu.myblog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(UserAction.CODE)
@RequestMapping("/user")
public class UserAction {
    public static final String CODE = "com.liu.myblog.action.UserAction";

    @Autowired
    @Qualifier(UserService.CODE)
    UserService userService;

    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public ModelAndView save(User user){
        ModelAndView modelAndView = new ModelAndView("success");
        userService.save(user);
        modelAndView.addObject("success","addUserSuccess");
        return modelAndView;
    }
}
