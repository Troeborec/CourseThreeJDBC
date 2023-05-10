import java.sql.*;

public class Aplication {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

        employeeDAO.getEmployeeById(3);
    }

}
