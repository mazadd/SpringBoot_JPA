package com.mayahii.demod.controller;

import com.mayahii.demod.bean.Forum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by root on 29/08/16.
 */
@Controller
public class ForumController {
    
    @Autowired
    private ForumRepository forumRepository;
    /*
    // CREATE
    @RequestMapping("/create")
    @ResponseBody
    public String create() {
        
        Forum forum = new Forum("any text");
        try {
            forumRepository.save(forum);
        } catch (Exception e) {
            
            return e.getMessage();
        }
        return "creation successful: " + String.valueOf(forum.getId());
    }
    
    // DELETE
    @RequestMapping("/del")
    @ResponseBody
    public String deleteDA(@ModelAttribute(value = "fom1") Forum forum){
        try{
            System.out.print("Elemento--> "+forum.getId()+" >> ");
            forumRepository.delete(forum);
        }catch (Exception ex){
            System.out.print("Errorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr ");
            return "Error deleting the user: "+ex.toString();
        }
        
        return "delete successful: ";
    }
    
    // UPDATE
    @RequestMapping("/update")
    @ResponseBody
    public String update(Forum forum) {
        Forum forum1;
        try {
            forum1 = forumRepository.findOne(forum.getId());
            forumRepository.save(forum1);
        }catch (Exception ex){
            return "Error updating the user: "+ ex.toString();
        }
        
        return "User successfuly updating";
    }
    
    // ALL USERS
    @RequestMapping(value = "/ALL", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getAll() {
        try{
            List<Forum> list  =(List<Forum>) forumRepository.findAll();
            ModelAndView model = new ModelAndView();
            model.addObject("list", list);
            return model;
        }catch (Exception ex){
            
        }
        return null;
    }
    
    
    // GET USER
    public Forum getById(long id) {
        Forum forum;
        try{
            forum = forumRepository.findForumById(id);
        }catch (Exception ex){
            return null;
        }
        return forum;
    }
    
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    @ResponseBody
    public ModelAndView getForums() {
        try{
            List<Forum> list  =(List<Forum>) forumRepository.findAll();
            ModelAndView model = new ModelAndView("test");
            model.addObject("test", list);
            return model;
        }catch (Exception ex){
            
        }
        return null;
    }
    
    @RequestMapping(name = "/green" )
    public String greeting(Model model){
        List<Forum> list  =(List<Forum>) forumRepository.findAll();
        model.addAttribute("lists",list);
        model.addAttribute("fom",new Forum());
        return "test";
    }
    
    @RequestMapping(name = "/green" , method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute(value = "fom") Forum forum) {
        forumRepository.save(forum);
        return "redirect:/green";
    }
    
    @RequestMapping(name = "/delete/{id}")
    public ModelAndView greetingSubmitDDDDD(@PathVariable Integer id) {
        ModelAndView modelAndView = new ModelAndView("redirect:/green");
        forumRepository.delete(new Forum(id));
        return modelAndView;
    }
    */
    @RequestMapping(name = "/green" )
    public String greeting(Model model){
        List<Forum> list  =(List<Forum>) forumRepository.findAll();
        model.addAttribute("lists",list);
        model.addAttribute("fom",new Forum());
        return "test";
    }
    
    @RequestMapping(name = "/green" , method = RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute(value = "fom") Forum forum) {
        forumRepository.save(forum);
        return "redirect:/green";
    }
    @RequestMapping(value="/delete")
    public String delete(Long id) {
        
        Forum forum = new Forum();
        forum.setId(id);
        forumRepository.delete(forum);
        return "redirect:/green";
    }
    
}
