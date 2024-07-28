package Employee_Management_System;
import java.sql.*;
public class Connect {
    Connection c;
    Statement s;

    public Connect () {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/EmployeeManagementSystem", "root", "200212");
            s = c.createStatement();
            System.out.println("Connection Successful");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Connection Failed");
        }
    }
}
