import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "city")
@Setter
@Getter
@ToString
@EqualsAndHashCode
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int city_id;
    @Column(name = "city_name")
    private String ciy_name;
    @OneToMany(mappedBy = "cityName", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
            //Выбрал fetch = FetchType.EAGER , т.к  перечесление городов без работников не необходимо

    List<Employee> employees;
    }
