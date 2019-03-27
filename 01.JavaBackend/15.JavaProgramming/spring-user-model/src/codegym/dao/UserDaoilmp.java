package codegym.dao;

import codegym.model.Login;
import codegym.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoilmp {
    private static List<User> users;
    static {
        users=new ArrayList<>();
        users.add(new User("hai","123456","Hai","zitxiem",20));
        users.add(new User("hoa","123456","Hoa","zitxiem",18));
        users.add(new User("huy","123456","Huy","zitxiem",11));
        users.add(new User("phuc","123456","Phuc","zitxiem",20));
    }


    public static User checkLogin(Login login) {
        for (User u: users) {
            if(u.getUser().equals(login.getUser()) && u.getPassword().equals(login.getPassword())){
                return u;
            }
        }
        return null;
    }
}
