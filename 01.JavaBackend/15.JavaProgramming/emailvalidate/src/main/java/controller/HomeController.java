package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static Pattern pattern;
    private Matcher matcher;
    // Khai báo Regex
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/")
    public String home(Locale locale, Model model) {
        return "index";
    }
}
