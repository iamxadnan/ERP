package com.klef.jfsd.sdpproject.service;

public interface AdminService {

    

    // Operations related to faculty handled by admin
    public String addFaculty();
    public String removeFaculty();
    public String checkLeaveApplication();
    public String postDuties();
    

    // operations related to students handled by admin
    public String addStudent();
    public String removeStudent();

    
    // operations related to college handled by admin
    public String postNews();
    

}
