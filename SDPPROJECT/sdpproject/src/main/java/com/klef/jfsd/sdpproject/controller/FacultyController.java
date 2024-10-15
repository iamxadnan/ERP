package com.klef.jfsd.sdpproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.klef.jfsd.sdpproject.models.Faculty;
import com.klef.jfsd.sdpproject.service.FacultyService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
@ResponseBody
@RequestMapping("/faculty")
public class FacultyController {
    @Autowired
    FacultyService facultyService;
    @PostMapping("/register")
    public String addfaculty(@RequestBody Faculty entity) {
       return facultyService.FacultyRegistration(entity);
    }
    @PutMapping("/update")
    public String updatefaculty(@RequestBody Faculty entity) {
       return facultyService.Update(entity);
    }
    
}
