package com.luv2code.springdemo.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;

@Controller
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
}
