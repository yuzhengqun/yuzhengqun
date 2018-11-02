package com.yzq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {

    @RequestMapping(value = "/", produces = "application/json;charset=UTF-8")
    public String index(ModelMap map) {
        return "index";
    }
}
