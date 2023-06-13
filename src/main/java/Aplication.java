import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
public class Aplication {
    public static void main(String[] args) {
        Logger.getLogger("org.hibernate").setLevel(Level.OFF);

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Здесь можно выполнять операции с entityManager

        CityDAOImpl cityDAO = new CityDAOImpl();
        EmployeeDAOImpl employeeDAO = new EmployeeDAOImpl();

        //Cписок сотрудников
        List<Employee> employeeList = List.of(
                new Employee("Олег 1", "Нечипоренко1", "boy", 21, 1),
                new Employee("Олег 2", "Нечипоренко2", "boy", 21, 2),
                new Employee("Олег 3", "Нечипоренко3", "boy", 21, 3)

        );

        //Создал город
        CityDAO.createCity

        entityManager.close();
        entityManagerFactory.close();
    }

}
