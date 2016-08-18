package edu.cumtb.controller;

import edu.cumtb.model.User;
import edu.cumtb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Administrator
 * Created by tbpwang
 * 2016/8/3.
 */
@Controller
@RequestMapping("user")
public class UserController extends BaseController {
    @Autowired
    UserService userService;

    @RequestMapping("login")
    String login(User user){
        user=userService.login(user);
        if (user!=null) {
            session.setAttribute("user", user);
            String role = user.getRole();
            if (role.equals("admin")) {
                System.out.println(role + user);
            }

        }
        return null;
    }
}
