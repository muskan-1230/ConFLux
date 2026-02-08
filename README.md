# 🚀 ConFlux
### Workflow-Driven Platform for Hackathons & Technical Events

![Java](https://img.shields.io/badge/Java-23-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.x-brightgreen)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![Maven](https://img.shields.io/badge/Maven-Build-red)
![Status](https://img.shields.io/badge/Status-Active-success)

ConFlux is a **scalable backend system** built using **Spring Boot** to manage **hackathons, technical events, and user workflows**.  
It focuses on **secure user registration, clean API design, and industry-grade backend practices**, making it suitable for **real-world applications and production-ready systems**.

---

## ✨ Key Highlights

- 🔐 Secure user registration with **BCrypt password hashing**
- 🧠 Clean architecture using **Controller → Service → Repository**
- ⚠️ Centralized **global exception handling**
- 🗄️ MySQL integration using **Spring Data JPA**
- 🧩 DTO-based request & response handling
- 🚀 Designed to scale for **events, teams, judges, and analytics**
- 🌟 Resume-ready backend with professional Git practices

---

## 🛠️ Tech Stack

| Layer | Technology |
|-----|-----------|
| Language | Java |
| Framework | Spring Boot |
| Database | MySQL |
| ORM | Hibernate / JPA |
| Security | Spring Security + BCrypt |
| Build Tool | Maven |
| API Testing | Postman |

---

## 📂 Project Structure
```
src/main/java/com/conflux/backend
│
├── controller # REST APIs
├── service # Business logic
├── repository # Database layer (JPA)
├── entity # Database entities
├── dto # Request & response DTOs
├── exception # Custom exceptions & handlers
├── config # Security configuration
└── ConFluxBackendApplication.java
```

---

## 🔄 API Endpoints

## ▶️ Register User
**POST** `/api/users/register`

## Request Body
```json
{
  "name": "Muskan",
  "email": "muskan@test.com",
  "password": "test123",
  "role": "PARTICIPANT"
}
```
## Success Response
``` json
{
  "message": "User registered successfully"
}
```
## Error Response (Duplicate Email)
``` json
{
  "message": "Email already exists"
}
```

---

## ⚙️ Setup & Run Locally

- 1️⃣ Clone Repository
```
git clone https://github.com/muskan-1230/ConFlux.git
cd ConFLux
```

- 2️⃣ Create Database
```
CREATE DATABASE conflux_db;
```

- 3️⃣ Configure Database
```
Update application.properties (kept private via .gitignore):

spring.datasource.url=jdbc:mysql://localhost:3306/conflux_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

- 4️⃣ Run Application
```
mvn spring-boot:run
```

- Server starts at:
```
http://localhost:8080
```

---

## 🧠 Learning Outcomes

This project demonstrates:

- Real-world Spring Boot backend development
- Secure handling of sensitive data
- Professional exception handling strategy
- Clean API design & maintainable codebase
- Git & GitHub best practices

---

## 🚧 Roadmap

- 🔑 JWT-based authentication & authorization
- 👥 Role-based access control (Admin / Organizer / Judge / Participant)
- 🏆 Hackathon & event management APIs
- 🤝 Team formation & evaluation workflows
- 📊 Analytics & performance dashboards
- 🌐 Frontend integration (Angular / React)

---

## 👩‍💻 Author

**Muskan**  
Passionate about building scalable systems & real-world applications  
GitHub: https://github.com/muskan-1230  
LinkedIn: https://www.linkedin.com/in/muskan-jain-645144292
