public interface EmployeeDAO {

    // Создание (добавление) сущности Employee в таблицу.
    void addEmployee(Employee employee);

    // Получение конкретного объекта Employee по id.
    void getEmployeeById(int id);

    //Получение списка всех объектов Employee из базы.
    void getAllEmployee();

    //Изменение конкретного объекта Employee в базе по id.
    void updateEmployeeById(int id);

    //Удаление конкретного объекта Employee из базы по id.
    void deleteEmployeeById(int id);
}
