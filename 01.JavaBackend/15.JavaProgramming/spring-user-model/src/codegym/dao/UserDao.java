package codegym.dao;


import codegym.model.Login;
import codegym.model.User;

public interface UserDao {
     User checkLogin(Login login);
}
