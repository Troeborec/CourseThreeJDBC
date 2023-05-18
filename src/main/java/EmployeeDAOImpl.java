import javax.persistence.*;
import javax.swing.text.html.parser.Entity;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

    final String user = "postgres";
    final String password = "1111";
    final String url = "jdbc:postgresql://localhost:5432/skypro";

  /*  private static EntityManager createEntityManager() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myPersistenceUnit");

        return entityManagerFactory.createEntityManager();
    }

   */


   public   static EntityManager readPersistent() {
        EntityManagerFactory entityManagerFactory =
                Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }

    public void addEmployee(Employee employee) {
        EntityManager entityManager = readPersistent();
        entityManager.persist(employee);

        entityManager.getTransaction().commit();
        entityManager.close();

        }

    @Override
    public void getEmployeeById(int id) {

        EntityManager entityManager = readPersistent();
        Employee employee = entityManager.find(Employee.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

        @Override
    public void getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
            EntityManager entityManager = readPersistent();
            String s = "SELECT e FROM Employee e";
            TypedQuery<Employee> query = entityManager.createQuery(s, Employee.class);
            List<Employee> employees = query.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
        }

    @Override
    public void updateEmployeeById(int id) {

    }

    @Override
    public void updateEmployeeById(Employee employee, int id) {

    }


    @Override
    public void deleteEmployeeById(int id) {

    }


    }
