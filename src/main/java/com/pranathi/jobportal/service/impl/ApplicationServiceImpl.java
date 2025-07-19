package com.pranathi.jobportal.service.impl;

import com.pranathi.jobportal.enitity.Application;
import com.pranathi.jobportal.enitity.Job;
import com.pranathi.jobportal.enitity.User;
import com.pranathi.jobportal.repository.ApplicationRepository;
import com.pranathi.jobportal.repository.JobRepository;
import com.pranathi.jobportal.repository.UserRepository;
import com.pranathi.jobportal.service.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {
    private final ApplicationRepository applicationRepository;
    private final UserRepository userRepository;
    private final JobRepository jobRepository;

    @Autowired
    public ApplicationServiceImpl(ApplicationRepository applicationRepository,
                                  UserRepository userRepository,
                                  JobRepository jobRepository) {
        this.applicationRepository = applicationRepository;
        this.userRepository = userRepository;
        this.jobRepository = jobRepository;
    }

    @Override
    public Application applyToJob(Application application) {
        // Optional: Add validation here
        return applicationRepository.save(application);
    }

    @Override
    public List<Application> getApplicationsByUserId(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + userId));
        return applicationRepository.findByApplicant(user);
    }

    @Override
    public List<Application> getApplicationsByJobId(Long jobId) {
        Job job = jobRepository.findById(jobId)
                .orElseThrow(() -> new RuntimeException("Job not found with ID: " + jobId));
        return applicationRepository.findByJob(job);
    }

    @Override
    public List<Application> getAllApplications() {
        return List.of();
    }

    @Override
    public void deleteApplication(Long id) {
        applicationRepository.deleteById(id);
    }

}
