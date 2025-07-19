package com.pranathi.jobportal.service;

import com.pranathi.jobportal.enitity.Application;

import java.util.List;

public interface ApplicationService {
    Application applyToJob(Application application);            // Apply to a job
    List<Application> getApplicationsByUserId(Long userId);     // View user applications
    List<Application> getApplicationsByJobId(Long jobId);
    List<Application> getAllApplications();   // View job applicants
    void deleteApplication(Long id);                            // Delete application

}
