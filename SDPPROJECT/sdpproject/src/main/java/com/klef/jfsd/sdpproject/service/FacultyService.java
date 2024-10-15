package com.klef.jfsd.sdpproject.service;

import com.klef.jfsd.sdpproject.models.Faculty;

public interface FacultyService {
    public String FacultyRegistration(Faculty faculty);
    public String Update(Faculty faculty);
    public String Delete(int id);
}
