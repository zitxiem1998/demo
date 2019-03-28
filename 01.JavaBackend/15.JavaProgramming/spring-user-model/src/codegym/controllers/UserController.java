package codegym.controllers;

import codegym.dao.UserDao;
import codegym.dao.UserDaoilmp;
import codegym.model.Login;
import codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    private UserDao userDao;

    public UserController() {
        this.userDao = new UserDaoilmp();
    }

    @GetMapping("/home")
    public ModelAndView getHome() {
        ModelAndView modelAndView = new ModelAndView("home", "login", new Login());
        return modelAndView;
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login) {
        User user= userDao.checkLogin(login);
        if(user==null) {
            return new ModelAndView("error");
        } else {
            return new ModelAndView("user","user",user);
        }
    }
}
