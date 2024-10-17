# Sales System - Product Sales Management

## Project Overview
This project is a backend web service for managing product sales orders. It is designed to register sales orders, linking them to users, order details for each product, and the associated payment. Products are also categorized and linked to their respective order details. The system supports core functionalities for managing sales orders, users, products, and their categories. This project was developed as part of the **Object-Oriented Programming in Java** course from **DevSuperior**.

## Features
- **Sales Orders:** Register and manage sales orders.
- **Users:** Associate each sales order with a user.
- **Products:** Each product can be linked to multiple orders.
- **Order Items:** Manage details of each product within an order.
- **Payments:** Record payments for each sales order.
- **Product Categories:** Organize products into different categories.

## Tools & Technologies
- **Java:** The core language used for development.
- **Spring Boot:** Framework for building the backend web service.
- **JPA / Hibernate:** ORM tool for handling database operations.
- **H2 Database:** In-memory database used during development and testing.

## Database Structure
The project uses a relational database with the following tables:

- **TB_CATEGORY:** Stores the categories to which products belong.
- **TB_ORDER:** Stores sales orders, including the status, client information, and order timestamp.
- **TB_ORDERITEM:** Manages the relationship between orders and products, including quantities and pricing details.
- **TB_PAYMENT:** Stores payment details related to specific orders.
- **TB_PRODUCT:** Stores product information, such as name, description, and price.
- **TB_PRODUCT_CATEGORY:** Associates products with their respective categories.
- **TB_USER:** Stores user information such as name, email, and phone number.

## Domain Model
![Domain Model](https://github.com/hrsantos99/project-springboot3-jpa/blob/main/assets/domainModel.png?raw=true)

## Contact
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/hrsantoss)

[![Email](https://img.shields.io/badge/Email-henriquersantos99@outlook.com-blue?style=flat-square)](mailto:henriquersantos99@outlook.com)
