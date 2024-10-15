package com.klef.jfsd.sdpproject.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.sdpproject.models.Faculty;
import com.klef.jfsd.sdpproject.repository.FacultyRepository;
@Service
public class FacultyServiceImpl implements FacultyService {
    @Autowired
    private FacultyRepository facultyRepository;

    @Override
    public String FacultyRegistration(Faculty faculty) {
        facultyRepository.save(faculty);
        return "Faculty registered successfully";
    }

    @Override
    public String Update(Faculty faculty) {
        
       Optional<Faculty> obj=facultyRepository.findById(faculty.getUserid());
       String msg=null;
       if(obj.isPresent()){
        Faculty f=obj.get();
        f.setFirstname(faculty.getFirstname());
        f.setLastname(faculty.getLastname());
        f.setDateOfBirth(faculty.getDateOfBirth());
        f.setGender(faculty.getGender());
        f.setPassword(faculty.getPassword());
        facultyRepository.save(f);
        msg="Faculty updated successfully";
       }
       else{
        msg="Faculty not found";
       }
       return msg;
       
    }

    @Override
    public String Delete(int id) {
        
        return null;
        
    }   
}
