package hiber.service;

import hiber.model.Car;
import hiber.model.User;

import javax.transaction.Transactional;
import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    User getUserById(int id);
    @Transactional
    User getUserByCar(String model, int series);
}
