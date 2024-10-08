package hiber.dao;

import hiber.service.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   User findUserByCar(String model, int series);
   List<User> listUsers();

}
