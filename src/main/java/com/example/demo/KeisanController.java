package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("")
public class KeisanController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("data1","0");
        model.addAttribute("data2","0");
        model.addAttribute("gokei","0");
        return "index";
    }

    @PostMapping("")
    public String index(@RequestParam("data1")int data1, @RequestParam("data2")int data2, Model model){
        model.addAttribute("data1",String.valueOf(data1));
        model.addAttribute("data2",String.valueOf(data2));
        String gokei = String.valueOf(data1 + data2);
        model.addAttribute("gokei",gokei);
        return "index";
    }




}
