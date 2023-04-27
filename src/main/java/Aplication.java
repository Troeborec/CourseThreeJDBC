import java.sql.*;

public class Aplication {
    public static void main(String[] args) {
        final String user = "postgres";
        final String password = "1111";
        final String url = "jdbc:postgresql://localhost:5432/skypro";

        try (final Connection connection =
                     DriverManager.getConnection(user, password, url);
             PreparedStatement statement =
                     connection.prepareStatement("SELECT * FROM employee FULL JOIN city ON employee.city_id = city.city_id")) {
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                if (id == 4) {
                    String first_name = resultSet.getString("first_name");
                    String last_name = resultSet.getString("last_name");
                    String gender = resultSet.getString("gender");
                    String city_name = resultSet.getString("city_name");

                    System.out.println("ФИО: " + first_name + " " + last_name);
                    System.out.println("пол: " + gender);
                    System.out.println("город проживания: " + city_name);
                    break;
                }
            }

        } catch (SQLException e) {
            System.out.println("Ошибка при подключении к базе данных!");
            e.printStackTrace();
        }
    }
}
