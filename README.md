# Employee_Management_Service-JWT
A RESTful Employee Management Service built with Spring Boot and Cassandra, providing CRUD operations with JWT-based authentication. This service enables secure management of employee records, including fields such as employee ID, first name, last name, email, and department.

# Features:
CRUD API: Endpoints for creating, reading, updating, and deleting employee records.
JWT Authentication: Secure user authentication and authorization with JSON Web Tokens.
Role-Based Access: Restrict access to certain operations based on user roles.
Stateless Sessions: Stateless authentication with Spring Security and JWT, eliminating the need for session management.
Cassandra Database: Integration with Cassandra for scalable and distributed data storage.

# Technologies Used:
Spring Boot for application setup and development
Spring Security for JWT-based authentication and authorization
Spring Data Cassandra for data access and schema management
Cassandra as the database
BCrypt for password encryption

# Summary of Endpoints
AuthController:
POST /auth/signup – Registers a new user in the system by saving their details in the Cassandra repository.
POST /auth/login – Authenticates a user, generating and returning a JWT for subsequent requests.
EmployeeController:
GET /employees – Retrieves a list of all employees.
POST /employees – Adds a new employee.
GET /employees/{id} – Retrieves the details of an employee by ID.
PUT /employees/{id} – Updates an employee’s details by ID.
DELETE /employees/{id} – Deletes an employee by ID.
