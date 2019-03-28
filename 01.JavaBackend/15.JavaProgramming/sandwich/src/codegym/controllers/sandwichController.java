package codegym.controllers;

import org.springframework.messaging.converter.MessageConversionException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;

@Controller
public class sandwichController {
    @GetMapping("/home")
    public String showSandwichSpice() {
        return "index";
    }

    @PostMapping("/condiment")
    public ModelAndView Condiment(@RequestParam("condiment") String[] condiment) {
        return new ModelAndView("condiment", "condiment", condiment);
    }
}
