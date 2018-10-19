# RESTAPI
A java project to create REST API for CRUD operation for a hotel management program

To run this project, setup this project as maven project and adding following data in pom.xml file.


After this step is done, run this project as Java Project and run Application.java as main file.

#USER INFORMATION
For user, use the following API end points
POST - http://localhost:8080/users
{
 "username": "admin",
 "name": "Tanya",
 "email": "tanyab@example.com",
 "rating":5,
 "hotelName": "ABC",
 "review":"This hotel is an amazing place to visit"
}
GET - http://localhost:8080/users/admin
To get a user info with username - admin

PUT - http://localhost:8080/users/admin

{
 "username": "admin",
 "name": "Tanya",
 "email": "tanyab@example.com",
 "rating":4,
 "hotelName": "ABC",
 "review":"This hotel is an simply okay"
}

DELETE - http://localhost:8080/users/admin


#HOTEL INFORMATION
For Hotel, use the following API end points
POST - http://localhost:8080/hotels
{
 "hotelname": "ABC",
 "city": "Indore",
 "memberNumber": "3",
 "acFac": "yes",
 "restaurant":"yes",
 "stars":"4"
}
GET - http://localhost:8080/hotels/ABC
To get a user info with username - admin

PUT - http://localhost:8080/hotels/ABC

{
 "city": "Ujjain",
 "memberNumber": "2",
 "acFac": "yes",
 "restaurant":"yes",
 "stars":"4"
}

DELETE - http://localhost:8080/hotels/ABC
