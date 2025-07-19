package com.pranathi.jobportal;

import com.pranathi.jobportal.enitity.Application;
import com.pranathi.jobportal.enitity.Job;
import com.pranathi.jobportal.enitity.User;
import com.pranathi.jobportal.repository.ApplicationRepository;
import com.pranathi.jobportal.repository.JobRepository;
import com.pranathi.jobportal.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JobportalApplication {

	public static void main(String[] args) {

		SpringApplication.run(JobportalApplication.class, args);
	}
	@Bean
	public CommandLineRunner loadData(UserRepository userRepo,
									  JobRepository jobRepo,
									  ApplicationRepository appRepo) {
		return args -> {
			// Users with role field
			User user1 = new User("been", "been@gmail.com", "password123", "JOBSEEKER");
			User user2 = new User("abcd", "abcd@gmail.com", "securepass", "RECRUITER");

			userRepo.save(user1);
			userRepo.save(user2);

			// Jobs (Set properties individually)
			Job job1 = new Job();
			job1.setTitle("Backend Java Developer");
			job1.setDescription("Develop REST APIs using Spring Boot.");
			job1.setLocation("Hyderabad");
			job1.setCompany("TechNova");
			job1.setRecruiter(user2); // recruiter is user2
			jobRepo.save(job1);

			Job job2 = new Job();
			job2.setTitle("Full Stack Engineer");
			job2.setDescription("Angular + Spring Boot developer needed.");
			job2.setLocation("Bangalore");
			job2.setCompany("InnovateTech");
			job2.setRecruiter(user2); // recruiter is user2
			jobRepo.save(job2);

			// Applications
			Application app1 = new Application();
			app1.setApplicant(user1);
			app1.setJob(job1);
			app1.setResumeLink("https://drive.google.com/resume-ananya");
			appRepo.save(app1);

			Application app2 = new Application();
			app2.setApplicant(user1);
			app2.setJob(job2);
			app2.setResumeLink("https://drive.google.com/resume-ananya");
			appRepo.save(app2);

			System.out.println("Sample data loaded successfully.");
		};
	}

}
