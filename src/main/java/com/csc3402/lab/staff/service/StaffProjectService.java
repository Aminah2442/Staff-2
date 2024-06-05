package com.csc3402.lab.staff.service;

import com.csc3402.lab.staff.model.StaffProject;

import java.util.List;

public interface StaffProjectService {

    void saveProject(StaffProject staffProject);
    List<StaffProject> findStaffProjectByStaffId(int Id);
}
