import java.sql.*;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Aplication {
    public static void main(String[] args) {
        java.util.logging.Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Здесь можно выполнять операции с entityManager


        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employeeOne = new Employee(1, "Олег1", "Нечипоренко1", "boy", 31,1 );
        Employee employeeTwo = new Employee(2, "Олег2", "Нечипоренко2", "boy", 32 ,2);
        Employee employeeThree = new Employee(3, "Олег3", "Нечипоренко3", "boy", 33 ,3);
        Employee employeeFour = new Employee(4, "Олег4", "Нечипоренко4", "boy", 34,4 );

        employeeDAO.getAllEmployee();
        employeeDAO.addEmployee(employeeOne);
        employeeDAO.updateEmployeeById(employeeFour, 3);
       // employeeDAO.deleteEmployeeById(1);

        entityManager.close();
        entityManagerFactory.close();
    }

}
