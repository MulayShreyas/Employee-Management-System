# Employee-Management-System

Project Description

The Employee Management System is a desktop application developed in Java using Swing and AWT for the graphical user interface. It uses MySQL as the database, connected via JDBC. The application allows users to manage employee data effectively.
Features

    Add Employee: Add new employee records to the database.
    Edit Employee: Update existing employee details.
    Delete Employee: Remove employee records from the database.
    Search Employee: Find employees by various criteria.
    Display Employees: View a list of all employees in a table format.
    Date Picker: Utilize JCalendar for selecting dates.
    Database Connectivity: Connect to MySQL database using JDBC.

Technologies Used

    Java Swing: For creating the graphical user interface.
    Java AWT: For event handling and additional GUI components.
    JCalendar: For date selection.
    JDBC: For database connectivity.
    rs2xml: For converting ResultSet to TableModel.
    MySQL Database: For storing employee data.
    JConnector: MySQL Connector/J for connecting Java applications with MySQL database.
    JRE: Java Runtime Environment for running the application.

Installation and Setup

    Clone the repository:

    bash

git clone https://github.com/yourusername/EmployeeManagementSystem.git

Setup the database:

    Install MySQL and create a database named employee_management.
    Import the SQL script provided in the db folder to create the necessary tables.

Configure Database Connection:

    Open the src/db/DatabaseConnection.java file.
    Update the database URL, username, and password to match your MySQL configuration.

java

    String url = "jdbc:mysql://localhost:3306/employee_management";
    String username = "your_username";
    String password = "your_password";

    Build and Run the Application:
        Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
        Build the project to resolve dependencies.
        Run the Main.java file to start the application.

Usage

    Launch the Application:
        Execute the Main.java file to open the Employee Management System.
    Add Employee:
        Navigate to the "Add Employee" section.
        Fill in the employee details and click "Submit".
    Edit Employee:
        Navigate to the "Edit Employee" section.
        Search for the employee and update the necessary details.
    Delete Employee:
        Navigate to the "Delete Employee" section.
        Search for the employee and click "Delete".
    Search Employee:
        Use the search functionality to find employees by name, department, or ID.
    Display Employees:
        View all employee records in a table format.

Screenshots

    Add Employee Screen:
    Employee List Screen:

Contributing

    Fork the repository.
    Create your feature branch (git checkout -b feature/your-feature).
    Commit your changes (git commit -m 'Add some feature').
    Push to the branch (git push origin feature/your-feature).
    Open a pull request.

License

This project is licensed under the MIT License. See the LICENSE file for details.
Acknowledgements

    Thanks to the developers of Java, MySQL, and all the libraries used in this project.
