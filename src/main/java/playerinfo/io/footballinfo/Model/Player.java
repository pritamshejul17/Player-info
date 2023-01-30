package playerinfo.io.footballinfo.Model;

import jakarta.persistence.*;

@Entity
public class Player {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer age;
    private String club;
    private String country;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Player(String name, Integer age, String club, String country) {
        this.name = name;
        this.age = age;
        this.club = club;
        this.country = country;
    }
    public Player(){};
}
