package hiber.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @OneToOne(mappedBy = "car", cascade = CascadeType.ALL)
    private User user;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "model")
    private String model;

    @Column(name = "series")
    private int series;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
