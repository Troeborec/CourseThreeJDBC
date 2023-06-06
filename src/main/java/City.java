import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "city")
@Setter
@Getter
@ToString
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id")
    private int city_id;
    @Column(name = "city_name")
    private String ciy_name;
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)

    public City(int city_id, String ciy_name) {
        this.city_id = city_id;
        this.ciy_name = ciy_name;
    }

    public int getCity_id() {
        return city_id;
    }

    public String getCiy_name() {
        return ciy_name;
    }
}
