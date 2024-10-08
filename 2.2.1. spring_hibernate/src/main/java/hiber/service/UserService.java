package hiber.service;

import hiber.service.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    User findUserByCar(String model, int series);
    List<User> listUsers();

}
