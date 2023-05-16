import java.sql.*;

public class Aplication {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employeeOne = new Employee(1, "Олег1", "Нечипоренко1", "boy", 31, 12345);
        Employee employeeTwo = new Employee(2, "Олег2", "Нечипоренко2", "boy", 32, 123456);
        Employee employeeThree = new Employee(3, "Олег3", "Нечипоренко3", "boy", 33, 123457);
        Employee employeeFour = new Employee(4, "Олег4", "Нечипоренко4", "boy", 34, 1234588);

       // employeeDAO.getEmployeeById(3);
        employeeDAO.getAllEmployee();
        //employeeDAO.addEmployee(employeeTwo);
       // employeeDAO.deleteEmployeeById(2);
    }

}
