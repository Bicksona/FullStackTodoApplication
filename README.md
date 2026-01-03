
# 📝 Todo Application (Spring Boot)

A clean and user-friendly **Todo Application** built using **Spring Boot, Thymeleaf, Spring Data JPA, and Bootstrap**.  
This project demonstrates a complete **CRUD-based MVC web application** with visual task status indicators.

---

## 🚀 Features

- ➕ Add new tasks  
- 👁️ View all tasks  
- ✅ Toggle task completion  
- 🗑️ Delete tasks with confirmation  
- 🎨 Visual status indication  
  - 🔴 Incomplete tasks (Red)  
  - 🟢 Completed tasks (Green)  
- 📱 Responsive UI with Bootstrap  
- 🧩 Layered architecture (Controller, Service, Repository)

---

## 🛠️ Tech Stack

- **Backend:** Spring Boot, Spring MVC  
- **Frontend:** Thymeleaf, HTML5, CSS3, Bootstrap 5  
- **Database:** MySQL / H2  
- **ORM:** Spring Data JPA  
- **Build Tool:** Maven  
- **Java Version:** Java 17+  

---

## 📸 Application Screenshot

![Todo Application UI](TodoInterface.png)

---

## 📂 Project Structure

```
todoApplication
│
├── Controller
│   └── TaskController.java
│
├── Service
│   └── TaskService.java
│
├── Model
│   └── Task.java
│
├── Repository
│   └── TaskRepository.java
│
├── resources
│   ├── templates
│   │   └── tasks.html
│   └── application.properties
│
└── TodoApplication.java
```

---

## ▶️ Run the Application

### Prerequisites
- Java 17+
- Maven
- MySQL or H2 database

### Steps

```bash
git clone https://github.com/your-username/todo-application.git
cd todo-application
mvn spring-boot:run
```

Open in browser:
```
http://localhost:8080/tasks
```

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 👨‍💻 Author

GitHub: https://github.com/bicksona
