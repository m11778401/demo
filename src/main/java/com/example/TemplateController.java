package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017-05-27.
 */
@Controller
@RequestMapping("/templates")
public class TemplateController {

    @RequestMapping("/hallo")

    public String hallo(Model model){
        model.addAttribute("name","Dear");
        return "hello";
    }
}
