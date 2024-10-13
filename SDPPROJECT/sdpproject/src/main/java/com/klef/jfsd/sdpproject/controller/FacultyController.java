package com.klef.jfsd.sdpproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.klef.jfsd.sdpproject.models.Faculty;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@RequestMapping("/faculty")
public class FacultyController {
    @PostMapping("/register")
    public String addfaculty(@RequestBody Faculty entity) {
        Faculty f= new Faculty();
        f.setFirstname(entity.getFirstname());
        
        
        return "employee registered successfully";
    }
    
}
