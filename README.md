<<<<<<< HEAD
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=21049541&assignment_repo_type=AssignmentRepo)
=======
🏷️ Internal Product Price Tracker
📘 Project Prompt

Develop a Spring Boot web application that allows users to track and compare product prices from multiple vendors or sources for internal or mock use cases.

🎯 Objectives

Users can add and manage products to track.

Store multiple vendor price entries for each product.

Generate reports to identify the lowest price per product.

Track and analyze historical price trends.

🧩 Tech Stack

Backend: Spring Boot (Spring Web, Spring Data JPA)

Database: PostgreSQL / MySQL

Frontend : Thymeleaf

Tools: Maven / Gradle, Lombok

🏗️ Project Architecture
com.pricecomparison
│
├── controller       → Handles incoming HTTP requests
├── service          → Business logic and operations
├── repository       → Data access layer (JPA Repositories)
├── model            → Entity classes mapped to DB tables
└── dto (optional)   → Data Transfer Objects

⚙️ Features

✅ Add and update product details
✅ Record vendor prices for each product
✅ Generate report showing lowest vendor price
✅ View price history and trend analysis
✅ Manage product and vendor data (CRUD)

🗃️ Database Structure

Tables:
user(id,name,email,role,join_date)

products(id, name, description, category)

vendors(id, name, contact_info)

price_entries(id, product_id, vendor_id, price, date_recorded)



📈 Future Enhancements

Price drop alerts via email

External API integration for live prices

Dashboard with visual analytics (Chart.js)

User authentication (Admin/User roles)
>>>>>>> 623d86abdfdb0f8bbd375d1f19e4c2cad37fed9b
