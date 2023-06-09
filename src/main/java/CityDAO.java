import java.util.List;

public interface CityDAO {

    void createCity(City city);

    City getCityById(int id);

    List<City> getAllCity();

    void updateCity(City city);

    void deleteCityById (int id);


}