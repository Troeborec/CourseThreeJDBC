import java.sql.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Aplication {
    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Здесь можно выполнять операции с entityManager


        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();
        Employee employeeOne = new Employee(1, "Олег1", "Нечипоренко1", "boy", 31 );
        Employee employeeTwo = new Employee(2, "Олег2", "Нечипоренко2", "boy", 32 );
        Employee employeeThree = new Employee(3, "Олег3", "Нечипоренко3", "boy", 33 );
        Employee employeeFour = new Employee(4, "Олег4", "Нечипоренко4", "boy", 34 );

        //employeeDAO.getEmployeeById(3);
         employeeDAO.addEmployee(employeeOne);
        employeeDAO.getAllEmployee();
        employeeDAO.addEmployee(new Employee(1, "Валек", "Викторов", "boy", 19));
       // employeeDAO.deleteEmployeeById(employeeThree);

        entityManager.close();
        entityManagerFactory.close();
    }

}
