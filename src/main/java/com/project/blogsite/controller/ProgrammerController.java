package com.project.blogsite.controller;

import com.project.blogsite.model.Programmer;
import com.project.blogsite.repository.ProgrammerRepository;
import com.project.blogsite.service.ProgrammerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class ProgrammerController {
    @Autowired
    ProgrammerService programmerService;

    @RequestMapping("/")
    public String home(){
        return "home";
    }

//    @RequestMapping(value = "/addProgrammer", method = RequestMethod.GET)
//    public String addProgrammer( @RequestParam String pName, @RequestParam String pLang, Model model){
//        model.addAttribute("pName", pName);
//        model.addAttribute("pLang", pLang);
//        return "programmerInfo";
//    }

    @PostMapping("/addProgrammer")
    public String addProgrammer(@ModelAttribute Programmer programmer, RedirectAttributes redirectAttributes){
        programmerService.save(programmer);
        redirectAttributes.addFlashAttribute("message", "New programmer added");
        return "redirect:/";
    }

    @GetMapping("/showProgrammer")
    public String showProgrammer(Model model) {
        List<Programmer> programmerList = programmerService.show();
        model.addAttribute("programmerList",  programmerList);
        return "programmerInfo.html";
    }

    @GetMapping("/admin")
    public String showAdminPanel(Model model) {
        return "adminPanel.html";
    }

    @GetMapping("/user")
    public String showUserPanel(Model model) {
        return "userPanel.html";
    }
}
