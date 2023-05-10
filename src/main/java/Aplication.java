import java.sql.*;

public class Aplication {
    public static void main(String[] args) {
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employeeOne = new Employee(1, "Олег1", "Нечипоренко1", "boy", 31, "Санкт-Петербург");
        Employee employeeTwo = new Employee(2, "Олег2", "Нечипоренко2", "boy", 32, "Санкт-Петербург");
        Employee employeeThree = new Employee(3, "Олег3", "Нечипоренко3", "boy", 33, "Санкт-Петербург");
        Employee employeeFour = new Employee(4, "Олег4", "Нечипоренко4", "boy", 34, "Санкт-Петербург");

        employeeDAO.getEmployeeById(3);
    }

}
