package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {

    @GetMapping("/worldclock")
    public ModelAndView showIndex(@RequestParam(name = "city", required = false, defaultValue = "Asia/HoChiMinh")
                                          String city, Model model) {
        Date date=new Date();
        TimeZone local=TimeZone.getDefault();
        TimeZone locale=TimeZone.getTimeZone(city);

        long locale_time =date.getTime() +(locale.getRawOffset()-local.getRawOffset());
        date.setTime(locale_time);
        model.addAttribute("city", city);
        return new ModelAndView("index","date",date);
    }
}
