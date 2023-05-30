import javax.persistence.*;
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
        EntityManager entityManager = UtilEntity.createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        UtilEntity.closeManagerFactory();
        }

    @Override
    public Employee getEmployeeById(int id) {

        EntityManager entityManager = UtilEntity.createEntityManager();
        entityManager.getTransaction().begin();
        Employee employee = entityManager.find(Employee.class, id);
        System.out.println(employee);
        entityManager.getTransaction().commit();
        entityManager.close();
        UtilEntity.closeManagerFactory();

        return employee;
    }

        @Override
    public List<Employee> getAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();

            EntityManager entityManager =UtilEntity.createEntityManager();
            entityManager.getTransaction().begin();
            String s = "SELECT e FROM Employee e";
            TypedQuery<Employee> query = entityManager.createQuery(s, Employee.class);
            List<Employee> employees = query.getResultList();
            entityManager.getTransaction().commit();
            entityManager.close();
            UtilEntity.closeManagerFactory();
            return employeeList;
        }


    @Override
    public void updateEmployeeById(int id, Employee employee) {

        EntityManager entityManager = UtilEntity.createEntityManager();
        entityManager.getTransaction().begin();
        Employee empForUpdate = entityManager.find(Employee.class, id);
        empForUpdate.setFirst_name(employee.getFirstName());
        empForUpdate.setLast_name(employee.getLastName());
        empForUpdate.setGender(employee.getGender());
        empForUpdate.setAge(employee.getAge());
        empForUpdate.setId(employee.getId());
        entityManager.merge(empForUpdate);
        entityManager.getTransaction().commit();
        entityManager.close();
        UtilEntity.closeManagerFactory();

    }

    @Override
    public void deleteEmployeeById(Employee employee) {

        EntityManager entityManager = UtilEntity.createEntityManager();
        Employee empForDelete = entityManager.find(Employee.class, employee.getId());
        entityManager.getTransaction().begin();
        entityManager.remove(empForDelete);
        entityManager.getTransaction().commit();
        entityManager.close();
        UtilEntity.closeManagerFactory();


    }


    }
