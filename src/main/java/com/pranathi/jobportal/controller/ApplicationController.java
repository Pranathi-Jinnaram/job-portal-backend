package com.pranathi.jobportal.controller;

import com.pranathi.jobportal.enitity.Application;
import com.pranathi.jobportal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applications")
public class ApplicationController {
    private final ApplicationService applicationService;

    @Autowired
    public ApplicationController(ApplicationService applicationService) {
        this.applicationService = applicationService;
    }

    // Apply to a job
    @PostMapping
    public Application applyToJob(@RequestBody Application application) {
        return applicationService.applyToJob(application);
    }

    // Get applications by user ID
    @GetMapping("/user/{userId}")
    public List<Application> getApplicationsByUser(@PathVariable Long userId) {
        return applicationService.getApplicationsByUserId(userId);
    }

    // Get applications by job ID
    @GetMapping("/job/{jobId}")
    public List<Application> getApplicationsByJob(@PathVariable Long jobId) {
        return applicationService.getApplicationsByJobId(jobId);
    }
    // Get all applications
    @GetMapping
    public List<Application> getAllApplications() {
        return applicationService.getAllApplications();
    }


    // Delete application by ID
    @DeleteMapping("/{id}")
    public String deleteApplication(@PathVariable Long id) {
        applicationService.deleteApplication(id);
        return "Application with ID " + id + " has been deleted.";
    }
}
