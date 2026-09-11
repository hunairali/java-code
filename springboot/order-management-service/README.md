# Order Management Service

This is a Spring Boot microservice for managing orders. It provides a RESTful API to create, retrieve, and manage orders.

## Project Structure

```
order-management-service
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── ordermanagement
│   │   │               ├── Order.java
│   │   │               ├── OrderController.java
│   │   │               ├── OrderService.java
│   │   │               └── OrderManagementApplication.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── example
│                   └── ordermanagement
│                       └── OrderManagementApplicationTests.java
├── pom.xml
└── README.md
```

## Setup Instructions

1. **Clone the repository:**
   ```
   git clone <repository-url>
   cd order-management-service
   ```

2. **Build the project:**
   ```
   mvn clean install
   ```

3. **Run the application:**
   ```
   mvn spring-boot:run
   ```

## API Endpoints

- **Create Order**
  - `POST /orders`
  - Request Body: `Order` object
  - Response: Created `Order` object

- **Get Order by ID**
  - `GET /orders/{id}`
  - Response: `Order` object

- **Get All Orders**
  - `GET /orders`
  - Response: List of `Order` objects

## Technologies Used

- Spring Boot
- Maven
- Java

## License

This project is licensed under the MIT License.