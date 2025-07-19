package com.pranathi.jobportal.repository;

import com.pranathi.jobportal.enitity.Application;
import com.pranathi.jobportal.enitity.Job;
import com.pranathi.jobportal.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ApplicationRepository extends JpaRepository<Application, Long> {
    // Get all applications by a specific user
    List<Application> findByApplicant(User applicant);

    // Get all applications for a specific job
    List<Application> findByJob(Job job);
}
