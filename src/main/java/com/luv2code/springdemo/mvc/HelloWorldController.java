package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/hello")
public class HelloWorldController {

        @RequestMapping("/showForm")
        public  String showForm(){
            return "helloworld-form";
        }

        @RequestMapping("/processForm")
        public String processForm(){
            return "helloworld";
        }

        @RequestMapping("processFormVersion2")
        public String convertCase(HttpServletRequest request, Model model){
            String message=request.getParameter("studentName");
            message="Hello " +message.toUpperCase();
            model.addAttribute("message",message);
            return "helloworld";
        }

        @RequestMapping("processFormVersion3")
        public String processFormVersion3(@RequestParam("studentName") String message, Model model){
            message="Hello " +message.toUpperCase()+", Welcome to v3";
            model.addAttribute("message",message);
            return "helloworld";
        }
}
