package com.klef.jfsd.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.klef.jfsd.sdpproject.models.Faculty;
@Repository
public interface FacultyRepository extends JpaRepository<Faculty,Integer>{

}
