# Todo List Application

The Todo List Application is a simple Spring Boot application that allows you to manage a list of todos. It provides RESTful API endpoints for creating, reading, updating, and deleting todos. This application uses Hibernate for database interaction and MySQL as the database.

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
- [Configuration](#configuration)
- [Running the Application](#running-the-application)
- [API Endpoints](#api-endpoints)
- [Testing](#testing)
- [Code Coverage](#code-coverage)
- [Deployment](#deployment)
- [Conversation Logs](#conversation-logs)
- [Project Feedback](#project-feedback)
- [Contributing](#contributing)
- [License](#license)

## Prerequisites

Before you begin, ensure you have met the following requirements:

- Java Development Kit (JDK) 8 or higher installed.
- Apache Maven or Gradle installed (for building the project).
- MySQL server installed and running.
- A REST client (e.g., Postman or cURL) for testing the API endpoints.

## Getting Started

1. Clone this repository to your local machine:

   ```shell
   git clone https://github.com/melqonyan-garik/todo-task
   ```
   
2. Navigate to the project directory:
   ```shell
   cd todo-task 
   ```

## Configuration

Configure the database connection by editing the src/main/resources/application.properties file. Replace the placeholders with your MySQL database information:

properties

spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_username  
spring.datasource.password=your_password  
Customize other application properties as needed.

## Running the Application
To run the application, use the following command:
   ```shell
./mvnw spring-boot:run
   ```                  

The application will start, and you can access the API endpoints at http://localhost:8080.

## API Endpoints

GET /todos: Retrieve all todos.

GET /todos/{id}: Retrieve a todo by ID.

POST /todos: Create a new todo. Provide JSON data with "title" and "description" fields.

PUT /todos/{id}: Update a todo by ID. Provide JSON data with updated "title" and "description" fields.

DELETE /todos/{id}: Delete a todo by ID.
Example API request and response formats are as follows:

GET /todos:
GET http://localhost:8080/todos

POST /todos:
POST http://localhost:8080/todos

Content-Type: application/json

{
"title": "Buy groceries",
"description": "Milk, eggs, bread"
}

PUT /todos/{id}:
PUT http://localhost:8080/todos/{id}

Content-Type: application/json

{
"title": "Buy groceries",
"description": "Milk, eggs, bread, and vegetables"
}
DELETE /todos/{id}:

DELETE http://localhost:8080/todos/{id}

## Testing

To run unit tests, use the following command:
````shell
./mvnw test
````

## Code Coverage

JaCoCo is a Java Code Coverage Library that provides tools to measure code coverage in your application. This project uses JaCoCo to generate code coverage reports.

How to Generate Code Coverage Report
To generate and view the code coverage report, follow these steps:

1. Run Tests with JaCoCo Agent:
   ```shell
    ./mvnw clean test
   ```
2. Generate JaCoCo Report:
   ```shell
   ./mvnw jacoco:report
   ```
3. View the Report:
   Open the generated HTML report located at target/site/jacoco/index.html in your web browser.

## Deployment

You can deploy this Spring Boot application to a production server or cloud platform of your choice. Ensure you configure the production database settings in the application.properties file, and consider securing the application with Spring Security and proper credentials management.
## Conversation Logs

ChatGPT conversation logs are available in the file [chat.log](src/main/resources/chat.log).
# Project Feedback

- **Was it easy to complete the task using AI?**
   - Yes, it's much more straightforward with AI assistance.

- **How long did the task take you to complete?**
   - Approximately 2 hours.

- **Was the code ready to run after generation? What did you have to change to make it usable?**
   - The generated code was ready to run; I made minor adjustments to the readme for clarity.

- **Which challenges did you face during completion of the task?**
   - The main challenge was formulating questions in a way that AI could understand and provide satisfactory answers.

- **Which specific prompts did you learn as a good practice to complete the task?**
   - The prompt "Create a list of tasks with examples of prompts I can ask you for each task to get relevant examples" proved to be a good practice to initiate the conversation.

## Contributing

Contributions are welcome! If you'd like to improve this project or fix any issues, please submit a pull request.

## License

This project is licensed under the MIT License - see the LICENSE.md file for details.