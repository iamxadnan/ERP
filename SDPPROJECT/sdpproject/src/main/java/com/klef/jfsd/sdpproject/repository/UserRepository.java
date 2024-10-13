package com.klef.jfsd.sdpproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klef.jfsd.sdpproject.models.User;

public interface UserRepository extends JpaRepository<User,Integer>{
    
}
