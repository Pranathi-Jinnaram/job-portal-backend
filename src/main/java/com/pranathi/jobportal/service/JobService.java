package com.pranathi.jobportal.service;

import com.pranathi.jobportal.enitity.Job;

import java.util.List;

public interface JobService {
    Job postJob(Job job);                         // Add a new job
    List<Job> getAllJobs();                       // View all jobs
    Job getJobById(Long id);                      // View job by ID
    void deleteJob(Long id);                      // Delete job by ID
    List<Job> getJobsByLocation(String location); // Filter by location
    List<Job> getJobsByCompany(String company);   // Filter by company
    List<Job> searchJobs(String keyword);         // Search by title/keyword
}
