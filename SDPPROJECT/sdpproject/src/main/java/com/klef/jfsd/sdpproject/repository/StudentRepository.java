package com.klef.jfsd.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.sdpproject.models.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>{

}
