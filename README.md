# Employee_Management_Service
A RESTful Employee Management Service built with Spring Boot and Cassandra, providing CRUD operations with JWT-based authentication. This service enables secure management of employee records, including fields such as employee ID, first name, last name, email, and department.

# Features:
CRUD API: Endpoints for creating, reading, updating, and deleting employee records. <br>
JWT Authentication: Secure user authentication and authorization with JSON Web Tokens. <br>
Role-Based Access: Restrict access to certain operations based on user roles. <br>
Stateless Sessions: Stateless authentication with Spring Security and JWT, eliminating the need for session management. <br>
Cassandra Database: Integration with Cassandra for scalable and distributed data storage. <br>

# Technologies Used:
Spring Boot for application setup and development. <br>
Spring Security for JWT-based authentication and authorization. <br>
Spring Data Cassandra for data access and schema management. <br>
Cassandra as the database. <br>
BCrypt for password encryption. <br>

# Summary of Endpoints
AuthController: <br>
POST /auth/signup – Registers a new user in the system by saving their details in the Cassandra repository. <br>
POST /auth/login – Authenticates a user, generating and returning a JWT for subsequent requests. <br>
EmployeeController: <br>
GET /employees – Retrieves a list of all employees. <br>
POST /employees – Adds a new employee. <br>
GET /employees/{id} – Retrieves the details of an employee by ID. <br>
PUT /employees/{id} – Updates an employee’s details by ID. <br>
DELETE /employees/{id} – Deletes an employee by ID. <br>
