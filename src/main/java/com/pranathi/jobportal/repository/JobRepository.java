package com.pranathi.jobportal.repository;

import com.pranathi.jobportal.enitity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public interface JobRepository extends JpaRepository<Job, Long> {
    // Custom query: find jobs by location
    List<Job> findByLocation(String location);

    // Custom query: find jobs by company
    List<Job> findByCompany(String company);

    // Custom query: search by job title (contains keyword)
    List<Job> findByTitleContainingIgnoreCase(String keyword);
}
