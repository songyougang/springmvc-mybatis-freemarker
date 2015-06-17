package com.ygs.smf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by songyougang on 6/17/15 12:07.
 */
@Controller
public class UserController {
    @RequestMapping("/greeting")
    public String greeting(ModelMap modelMap){
        modelMap.put("greeting", "Hello，您好！");
        return "greeting";
    }
}
