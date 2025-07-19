# 💼 Job Portal Management System

A simple yet powerful Job Portal application built using **Java**, **Spring Boot**, **Spring Data JPA**, and **MySQL**, following a clean layered architecture. This project supports basic job operations, user registrations, and job applications.

---

## 🔧 Tech Stack

- **Language:** Java 17  
- **Framework:** Spring Boot 3.5.3  
- **Database:** MySQL  
- **ORM:** Hibernate / JPA  
- **Build Tool:** Maven  
- **IDE:** IntelliJ IDEA / VS Code  
- **Version Control:** Git, GitHub  

---

## 📚 Features

✅ Register new users  
✅ Post new jobs  
✅ Apply for a job  
✅ View all posted jobs  
✅ Fetch all applications per job/user  
✅ Layered architecture: `Controller → Service → Repository`  
✅ Entity mapping using JPA annotations  
✅ CommandLineRunner to preload sample data  

---

## 🏗️ Project Structure

job-portal
├── controller/
│ ├── JobController.java
│ ├── UserController.java
│ └── ApplicationController.java
├── service/
│ ├── JobService.java
│ ├── UserService.java
│ ├── ApplicationService.java
│ └── impl/
│ ├── JobServiceImpl.java
│ ├── UserServiceImpl.java
│ └── ApplicationServiceImpl.java
├── repository/
│ ├── JobRepository.java
│ ├── UserRepository.java
│ └── ApplicationRepository.java
├── entity/
│ ├── Job.java
│ ├── User.java
│ └── Application.java
├── resources/
│ └── application.properties
└── JobportalApplication.java


## 📦 Setup Instructions

### ✅ Prerequisites

- Java 17  
- Maven  
- MySQL (Create a database called `job_portal_db`)  
- Git  

---

### 🚀 Run the Application

#### 1. Clone the repository

bash
git clone https://github.com/Pranathi-Jinnaram/job-portal-backend.git
cd job-portal-backend


### 2.spring.datasource.url=jdbc:mysql://localhost:3306/job_portal_db
  spring.datasource.username=root
  spring.datasource.password=your_password

  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true


### 3. Run the application
   mvn spring-boot:run
   Your APIs will now be running at:
🌐 http://localhost:8080/api/jobs
🌐 http://localhost:8080/api/users
🌐 http://localhost:8080/api/applications

### 4. API Testing with Postman:
  Test your endpoints using Postman.
  Download Postman Collection

   Example Request: Create Job:
   POST /api/jobs
Content-Type: application/json

{
  "title": "Backend Developer",
  "description": "Looking for experienced Java Spring Boot devs",
  "location": "Remote"
}


🔮 Future Enhancements
✅ User Interface: Add frontend using React or Angular
✅ Validation: Add form and field-level validation using JSR-303
✅ Pagination & Sorting: For job listings and applications
✅ Search & Filters: Filter jobs by location, title, or date
✅ Swagger/OpenAPI: API documentation and testing UI
✅ DTO Pattern: Use ModelMapper for request/response separation
✅ Security: Spring Security with JWT for authentication & role-based access
✅ Timestamps: Add createdAt, updatedAt fields with auditing
✅ Docker Support: Dockerize Spring Boot + MySQL
✅ Cloud Deployment: Deploy on Render, Railway, or AWS



### ✅ Next Steps for You:

1. Save this as your `README.md` in the root of your project.  
2. Commit & push to GitHub:
   bash
   git add README.md
   git commit -m "Added detailed README"
   git push origin main

