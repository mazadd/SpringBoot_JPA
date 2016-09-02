package com.mayahii.demod.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by root on 29/08/16.
 */
@Controller
public class MainController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        String str = "Hello World!----";
        mav.addObject("message", str);
        return mav;
    }
}
