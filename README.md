# SmartPOS Customer Service

A microservice responsible for managing customer information in the SmartPOS system. This service provides RESTful APIs for customer management and uses MySQL for persistent data storage.

## Features

- View all customers
- Retrieve customer details by ID
- Add new customers
- Update customer information
- Delete customers
- MySQL database integration
- RESTful API architecture
- Docker containerization support

## Tech Stack

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
- Docker
- Docker Compose

## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   ├── controller/
│   │   ├── service/
│   │   ├── repository/
│   │   ├── entity/
│   │   └── PointofsaleApplication.java
│   └── resources/
│       └── application.properties
└── test/
```

## Prerequisites

Before running the application, ensure you have installed:

- Java 21
- Maven
- MySQL
- Docker (Optional)

## Installation

1. Clone the repository

```bash
git clone <repository-url>
```

2. Navigate to the project directory

```bash
cd customer-service
```

3. Configure database settings

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/shop_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

4. Build the project

```bash
mvn clean package
```

5. Run the application

```bash
java -jar target/customer-service.jar
```

Or run using Maven:

```bash
mvn spring-boot:run
```

The service will be available at:

```text
http://localhost:8081
```

## API Endpoints

| Method | Endpoint | Description |
|----------|----------|-------------|
| GET | /customers | Get all customers |
| GET | /customers/{id} | Get customer by ID |
| POST | /customers | Create a customer |
| PUT | /customers/{id} | Update customer details |
| DELETE | /customers/{id} | Delete a customer |

## Database

This service uses MySQL for storing customer information.

Example Customer Schema:

```sql
CREATE TABLE customers (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100),
    contact VARCHAR(20),
    address VARCHAR(255)
);
```

## Docker Support

Build the Docker image:

```bash
docker compose build
```

Run the service:

```bash
docker compose up
```

## Integration

This service is part of the SmartPOS Microservices Platform and works alongside:

- Item Service (Node.js + Express + MySQL)
- Order Service (Spring Boot + MongoDB)
- React Frontend Application

## Future Enhancements

- JWT Authentication
- API Gateway integration

## Author

Dimuth Samaranayake
