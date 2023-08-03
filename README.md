# Car Sharing Service

The Car Sharing Service project in Java, utilizing the Spring Framework, is a web

application that models the functionality of a car rental service. This project

encompasses essential components and features that enable users to rent, reserve,

and manage vehicles.

The application also integrates a Telegram chat-bot for notifications about rented

vehicles, as well as vehicles with expired or expiring rentals on the current day.

A payment module has also been implemented.

### Key Features:

`User Registration and Authentication:` Users can create accounts, log into the
system, and access the service's functionality. 

`Telegram Notifications:` Managers and users can receive notifications via a
Telegram chatbot regarding rental expirations.

`Viewing Available Cars:` Users can browse a list of available cars, with
information about the model, year of manufacture, rental cost, and more.

`Renting Cars:` Users can select a specific car and rent it
immediately or for a specified date. The system calculates the rental cost based on
duration and other parameters.

`Order Management:` Managers can view current and past orders.

`Administration:` Administrators possess special access rights for managing cars
(adding, editing, deleting), viewing and managing users, and orders.

### Technolegies:
• Programming Language: Java

• Framework: Spring (Spring Boot, Spring MVC, Spring Data JPA)

• Data Storage: Utilization of a relational database (MySQL) 
to store information about cars, users, and orders.

• Authentication and Authorization: Implementation of Spring Security 
to ensure user security, authentication, and authorization.

• API: Development of a RESTful API.

`Endpoint description:`
### Authentication Controller

    POST/login - login user
    POST/register - register new user

### Car Controller

    POST/cars - create new car
    GET/cars/ - get all cars
    GET/cars/{id} - get car by ID
    PUT/cars/{id} - update car by ID
    DELETE/cars/{id} - delete car by ID

### Payment Controller

    GET/payments - get payment by user ID
    POST/payments - create payment
    GET/payments/cancel - handle cancel payment
    GET/payments/success - handle success payment

### User Controller

    PUT/users/{id}/role - update role
    GET/users/me - get  user
    PUT/users/me - update  user

### Rental Controller

    GET/rentals/{id} - get rental by ID
    GET/rentals?user_id - get actual rental by user ID 
    POST/rentals - create new rental
    POST/rentals/{id}/return - set actual return date 

### Project Launch

Ensure that you have **`Java`** and **`Maven`** installed.

Clone this repository to your computer.

Configure the project settings to specify the database connection parameters.

Launch the application using the command mvn spring-boot:run.

Open a web browser and navigate to http://localhost:8080 to access the web interface.


### Conclusion
The Car Sharing Service project in Java Spring
demonstrates the basic functionality of a car rental service.
It can serve as a starting point for further development and expansion,
including adding new features, enhancing the user interface, and optimizing performance.