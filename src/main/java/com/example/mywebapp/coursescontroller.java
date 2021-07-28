package com.example.mywebapp;

import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Produces;

@Controller
public class coursescontroller {
    @RequestMapping("/courses")
    public String courses(HttpServletRequest req){
        String coursename = req.getParameter(("cname"));
        HttpSession session= req.getSession();
        session.setAttribute("cname",coursename);
        return "courses";
    }

}
