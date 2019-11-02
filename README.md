# **Build a Database Web App - Maven, Spring MVC, Spring Security and Hibernate Project**

An example in which I show the usage of Spring MVC, Hibernate and Spring Security.

It's a simple web customer tracker in which I do CRUD operations in a mysql Database with AOP.

The Spring Configuration is done in pure Java (no XML)

The usage of the security is in this way:

* Only users with valid id/passwords will be able to login
* Employee role: users in this role will only be allowed to list customers.
* Manager role: users in this role will be allowed to list, add and update
customers.
* Admin role: users in this role will be allowed to list, add, update and delete
customers.

If you want to see a Spring XML configuration without Spring Security go here (https://github.com/JoseManuelMunozManzano/web-customer-tracker) 

Note: There is a sql-script folder to create the schemas and the tables.