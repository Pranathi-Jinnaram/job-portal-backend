package com.pranathi.jobportal.controller;

import com.pranathi.jobportal.enitity.Job;
import com.pranathi.jobportal.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobController {
    private final JobService jobService;

    @Autowired
    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // Post a new job
    @PostMapping
    public Job postJob(@RequestBody Job job) {
        return jobService.postJob(job);
    }

    // Get all jobs
    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    // Get job by ID
    @GetMapping("/{id}")
    public Job getJobById(@PathVariable Long id) {
        return jobService.getJobById(id);
    }

    // Delete job by ID
    @DeleteMapping("/{id}")
    public String deleteJob(@PathVariable Long id) {
        jobService.deleteJob(id);
        return "Job with ID " + id + " has been deleted.";
    }

    // Filter by location
    @GetMapping("/location/{location}")
    public List<Job> getJobsByLocation(@PathVariable String location) {
        return jobService.getJobsByLocation(location);
    }

    // Filter by company
    @GetMapping("/company/{company}")
    public List<Job> getJobsByCompany(@PathVariable String company) {
        return jobService.getJobsByCompany(company);
    }

    // Search jobs by title
    @GetMapping("/search/{keyword}")
    public List<Job> searchJobs(@PathVariable String keyword) {
        return jobService.searchJobs(keyword);
    }
}
