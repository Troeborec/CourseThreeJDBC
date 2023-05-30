import java.util.List;

public interface EmployeeDAO {

    // Создание (добавление) сущности Employee в таблицу.
    void addEmployee(Employee employee);

    // Получение конкретного объекта Employee по id.
    Employee getEmployeeById(int id);

    //Получение списка всех объектов Employee из базы.
    List<Employee> getAllEmployee();

    //Изменение конкретного объекта Employee в базе по id.
    void updateEmployeeById(int id, Employee employee);


    //Удаление конкретного объекта Employee из базы по id.
    void deleteEmployeeById(Employee employee);
}
