# Employee-Management-System

## Project Description

The Employee Management System is a desktop application developed in Java using Swing and AWT for the graphical user interface. It uses MySQL as the database, connected via JDBC. The application allows users to manage employee data effectively.

## Requirement 
1) MySQL-Connector-j JAR (Java ARchive)
2) rs2xml JAR
3) jCalender JAR

## Features

 1) **Add Employee**: Add new employee records to the database.
 2) **Edit Employee**: Update existing employee details.
 3) **Delete Employee**: Remove employee records from the database.
 4) **Search Employee**: Find employees by various criteria.
 5) **Display Employees**: View a list of all employees in a table format.
 6) **Date Picker**: Utilize JCalendar for selecting dates.
 7) **Database Connectivity**: Connect to MySQL database using JDBC.

## Technologies Used:

1) **Java Swing**: For creating the graphical user interface.
2) **Java AWT**: For event handling and additional GUI components.
3) **JCalendar**: For date selection.
4) **JDBC**: For database connectivity.
5) **rs2xml**: For converting ResultSet to TableModel.
6) **MySQL Database**: For storing employee data.
7) **JConnector**: MySQL Connector/J for connecting Java applications with MySQL database.
8) **JRE**: Java Runtime Environment for running the application.

## Installation and Setup
 Clone the repository:
    bash
   
    git clone https://github.com/yourusername/EmployeeManagementSystem.git

## Setup the database:

   Install MySQL and create a database named employee_management.
    

## Configure Database Connection:

   Update the database URL, username, and password to match your MySQL configuration.

## Java

    String url = "jdbc:mysql://localhost:3306/employee_management";
    String username = "your_username";
    String password = "your_password";

   Build and Run the Application:
        i) Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
        ii) Build the project to resolve dependencies.
        iii) Run the Main.java file to start the application.

## Usage

1) ### Launch the Application:
    Execute the Main.java file to open the Employee Management System.
2) ### Add Employee:
   Navigate to the "Add Employee" section.
   Fill in the employee details and click "Submit".
3) ### Edit Employee:
   Navigate to the "Edit Employee" section.
   Search for the employee and update the necessary details.
4) ### Delete Employee:
   Navigate to the "Delete Employee" section.
   Search for the employee and click "Delete".
5) ### Search Employee:
   Use the search functionality to find employees by name, department, or ID.
6) ### Display Employees:
   View all employee records in a table format.

## Screenshots

   ![Screenshot from 2024-07-28 13-01-40](https://github.com/user-attachments/assets/43acbc77-f5d9-49ee-8e9c-e1f76b36b346)
   ![Screenshot from 2024-07-28 13-01-49](https://github.com/user-attachments/assets/74298293-930d-4c47-8213-0ee1d1dc600b)
   ![Screenshot from 2024-07-28 13-02-01](https://github.com/user-attachments/assets/dd94378a-b9b6-4ffc-a135-688ac6d5aa59)
   ![Screenshot from 2024-07-28 13-02-41](https://github.com/user-attachments/assets/2f09cf30-df37-48d5-a45a-f2e853d74301)
   ![Screenshot from 2024-07-28 13-04-59](https://github.com/user-attachments/assets/06ade747-c33f-40ba-a509-2b246a56c708)
   ![Screenshot from 2024-07-28 13-05-13](https://github.com/user-attachments/assets/489ece33-dc45-410d-8a73-85cff059b590)
   ![Screenshot from 2024-07-28 13-05-29](https://github.com/user-attachments/assets/9e0c2231-f6ea-4217-8ddf-e14f897bf528)
   ![Screenshot from 2024-07-28 13-05-54](https://github.com/user-attachments/assets/97a360f9-12db-49f0-b5b9-1d22cf644caf)
   ![Screenshot from 2024-07-28 13-06-42](https://github.com/user-attachments/assets/82988db0-72a0-4316-b752-af367b103128)
   ![Screenshot from 2024-07-28 13-06-45](https://github.com/user-attachments/assets/f4e219ae-82a0-46bf-a8a7-5215aed597ad)

    

## License

This project is licensed under the General Public License (GNU). See the LICENSE file for details.
Acknowledgements

Thanks to the developers of Java, MySQL, and all the libraries used in this project.
