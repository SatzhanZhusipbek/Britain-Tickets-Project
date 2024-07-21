# Tickets application
It is an application that gives one information about a ticket's
price when travelling between two towns. Customers can also
save their bought tickets to the database. 
## Instructions
- Download the project and unpack it
- Go to the Terminal
- Use "cd" command to get the location of the project
- Write "javac -project_name.java"
- Write "java -project_name"
- In the IDE you need to connect to Postgresql database
- Then you need to create a database named "ticket_ride_db"
- Then create a table "ticket" in the pg admin console
- To send requests to "//localhost:8080/" use Postman
### Endpoints
1. //localhost:8080/ticket/price -> to get the price of a ticket
2. //localhost:8080/tickets/ -> to save a purchased ticket
### Additional Comments
* The API that calculates the price of a ticket is public
* The API that saves a ticket is protected with a username and password