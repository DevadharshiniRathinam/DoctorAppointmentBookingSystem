# Doctor Appointment Booking System

## Overview
The **Doctor Appointment Booking System** is a comprehensive web-based application designed to streamline the process of scheduling medical appointments. It provides an efficient way for patients to book appointments, doctors to manage their schedules, and administrators to oversee the system's operations. The system ensures seamless communication between patients and healthcare providers.

## Features
- **User Authentication:** Secure login for patients, doctors, and administrators.
- **Doctor Profile Management:** Doctors can update their profiles, including specialization and availability.
- **Appointment Scheduling:** Patients can book, reschedule, or cancel appointments.
- **Appointment Tracking:** Both doctors and patients can view past and upcoming appointments.
- **Database Management:** MySQL is used to store user, doctor, and appointment data efficiently.

## Technologies Used & Justification
### Backend
- **Java & Spring Boot:**
  - Spring Boot simplifies the development of Java-based applications with minimal configuration.
  - Provides built-in features like dependency management, embedded servers, and security integration.
  - RESTful APIs facilitate smooth communication between frontend and backend.
- **Spring Data JPA (Hibernate):**
  - Simplifies database interactions with Object-Relational Mapping (ORM).
  - Provides an abstraction over JDBC, reducing boilerplate code.
- **MySQL Database:**
  - Used to store patient records, doctor details, and appointment information.
  - Optimized for handling large-scale data efficiently.
### Build & Deployment
- **Maven:**
  - Used for project dependency management and build automation.
  - Ensures a standardized development environment.
- **Tomcat (Embedded in Spring Boot):**
  - Serves as the application server, eliminating the need for manual configuration.
- **Postman (For API Testing):**
  - Helps in testing RESTful API endpoints during development.

## Installation & Setup

### Prerequisites
Ensure you have the following installed:
- Java
- Maven
- MySQL
- IntelliJ IDEA or any Java-compatible IDE
 ---
## Project Structure
```
DoctorAppointmentSystem/
│── src/
│   ├── main/
│   │   ├── java/com/example/doctorappointment/
│   │   │   ├── controller/      # Handles HTTP requests
│   │   │   ├── model/           # Defines database entities
│   │   │   ├── repository/      # Manages data access
│   │   │   ├── service/         # Business logic implementation
│   │   │   ├── DoctorAppointmentApplication.java  # Main entry point
│   │   ├── resources/
│   │   │   ├── application.properties  # Configuration file
│   │   │   ├── templates/  # Frontend HTML templates (if using Thymeleaf)
│   ├── test/  # Unit and integration tests
│── target/  # Compiled output
│── pom.xml  # Maven dependencies
```
---
---
## API Endpoints
### User Authentication
```
+----------+------------+-------------------+
| Method   | Endpoint   | Description       |
+----------+------------+-------------------+
| POST     | /register  | User registration |
| POST     | /login     | User login        |
| GET      | /logout    | User logout       |
+----------+------------+-------------------+
```
### Doctor Management
```
+----------+-------------------+----------------------------+
| Method   | Endpoint          | Description                |
+----------+-------------------+----------------------------+
| GET      | /doctors          | Fetch all doctors          |
| GET      | /doctors/{id}     | Get doctor details by ID   |
| POST     | /doctors          | Add a new doctor           |
| PUT      | /doctors/{id}     | Update doctor details      |
| DELETE   | /doctors/{id}     | Remove a doctor            |
+----------+-------------------+----------------------------+

```
### Appointment Management
```
+----------+--------------------------+-------------------------------+
| Method   | Endpoint                 | Description                  |
+----------+--------------------------+-------------------------------+
| GET      | /appointments            | View all appointments        |
| GET      | /appointments/{id}       | Get appointment details by ID|
| POST     | /appointments            | Book an appointment          |
| PUT      | /appointments/{id}       | Update appointment details   |
| DELETE   | /appointments/{id}       | Cancel an appointment        |
+----------+--------------------------+-------------------------------+
```
---

