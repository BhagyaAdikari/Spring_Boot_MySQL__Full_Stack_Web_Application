# Angular 18 + Material + Spring Boot + MySQL: Full Stack Employee CRUD Application 🚀

## 📋 Project Overview
This project is a **Full Stack Web Application** designed to perform **CRUD (Create, Read, Update, Delete)** operations for managing employee records. It combines the power of **Angular 18**, **Angular Material**, **Spring Boot**, and **MySQL**, providing a robust, responsive, and scalable solution. 🌟

## 🛠️ Tech Stack
- **Frontend**: Angular 18 with Angular Material (UI)
- **Backend**: Spring Boot (REST APIs)
- **Database**: MySQL (Relational Database)
- **Build Tools**: Maven (for the backend) and Angular CLI (for the frontend)
- **Other Dependencies**: Bootstrap, RxJS, Hibernate

## ✨ Features
- 📑 **Create**: Add new employees with detailed information.
- 👀 **Read**: View employee records in a dynamic and responsive table.
- ✏️ **Update**: Edit existing employee information.
- ❌ **Delete**: Remove employees from the system.
- 🔍 **Search**: Find employees by name or other criteria.
- 🖌️ **Angular Material Design**: Modern, responsive, and accessible UI components.

## 🚀 Getting Started
Follow the instructions below to set up the project on your local machine. 💻

### Prerequisites ✅
1. **Node.js** and **npm** (for Angular)
2. **Java JDK** (for Spring Boot)
3. **MySQL** (for database)
4. **Angular CLI**

### Installation Steps 🛠️
#### 1. Backend (Spring Boot + MySQL)
1. Clone the repository: `git clone <repository-url>`
2. Navigate to the backend folder: `cd backend`
3. Configure your **application.properties** file:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/employee_db
   spring.datasource.username=<your-mysql-username>
   spring.datasource.password=<your-mysql-password>
   ```
4. Run the application: `mvn spring-boot:run`

#### 2. Frontend (Angular 18)
1. Navigate to the frontend folder: `cd frontend`
2. Install dependencies: `npm install`
3. Run the development server: `ng serve`
4. Open your browser and go to: `http://localhost:4200`

## 📂 Project Structure
### Backend (Spring Boot)
```
backend/
├── src/main/java
│   ├── com.example.employee
│   │   ├── controller
│   │   ├── service
│   │   ├── repository
│   │   └── model
├── src/main/resources
│   └── application.properties
└── pom.xml
```

### Frontend (Angular)
```
frontend/
├── src
│   ├── app
│   │   ├── components
│   │   ├── services
│   │   ├── models
│   └── assets
└── angular.json
```

## 🌟 Key Highlights
- **Validation**: Proper form validation for user inputs.
- **Responsive Design**: Fully optimized for desktops and mobile devices.
- **RESTful APIs**: Clean and scalable backend services.
- **Error Handling**: Comprehensive error handling and alerts.

## 📸 Screenshots
- **Dashboard**
- **Add Employee Form**
- **Edit Employee Page**
- **Delete Confirmation Modal**

## 🤝 Contributing
Contributions are welcome! Feel free to fork the repository and submit a pull request.

## 📧 Contact
For any questions, feel free to reach out:
- **Email**: your-email@example.com
- **LinkedIn**: [Your LinkedIn Profile](#)

## 📝 License
This project is licensed under the MIT License. 📜

---

🎉 Thank you for using the **Employee CRUD Application**! Happy coding! 💻

