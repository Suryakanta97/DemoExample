package com.surya.customlogouthandler.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.surya.customlogouthandler.services.UserCache;
import com.surya.customlogouthandler.user.User;
import com.surya.customlogouthandler.user.UserUtils;

@Controller
@RequestMapping(path = "/user")
public class UserController {

    private final UserCache userCache;

    public UserController(UserCache userCache) {
        this.userCache = userCache;
    }

    @GetMapping(path = "/language")
    @ResponseBody
    public String getLanguage() {
        String userName = UserUtils.getAuthenticatedUserName();
        User user = userCache.getByUserName(userName);
        return user.getLanguage();
    }

}
