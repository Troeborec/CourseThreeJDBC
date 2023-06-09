import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class CityDAOImpl implements CityDAO {

    static EntityManager readPersistent() {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("myPersistenceUnit");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        entityManager.getTransaction().begin();
        return entityManager;
    }

    final String user = "postgres";
    final String password = "1111";
    final String url = "jdbc:postgresql://localhost:5432/skypro";

    @Override
    public void createCity(City city) {
        EntityManager entityManager = readPersistent();
        entityManager.persist(city);
        entityManager.getTransaction().commit();
        entityManager.close();
    }


    @Override
    public City getCityById(int id) {
        EntityManager entityManager = readPersistent();
        City city = entityManager.find(City.class, id);
        entityManager.getTransaction().commit();
        entityManager.close();
        return city;
    }

    @Override
    public List<City> getAllCity() {
        EntityManager entityManager = readPersistent();
        String s = "SELECT e FROM Employee e";
        TypedQuery<City> query = entityManager.createQuery(s, City.class);
        List<City> cities = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return cities;
    }


    @Override
    public void updateCity(City city) {
        EntityManager entityManager = readPersistent();
        entityManager.merge(city);
        entityManager.getTransaction().commit();
        entityManager.close();

    }

    @Override
    public void deleteCityById(int id) {
        EntityManager entityManager = readPersistent();
        entityManager.remove(entityManager.find(City.class, id));
        entityManager.getTransaction().commit();
        entityManager.close();
    }
}
