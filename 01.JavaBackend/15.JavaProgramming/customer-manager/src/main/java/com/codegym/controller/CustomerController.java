package com.codegym.controller;

import com.codegym.model.Customer;
import com.codegym.service.CustomerService;
import com.codegym.service.CustomerServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class CustomerController {
    private CustomerService customerService = new CustomerServiceImpl();

    @GetMapping("/")
    public ModelAndView showCustomer() {
        CustomerService customerService = new CustomerServiceImpl();
        return new ModelAndView("index", "customers", customerService.findAll());
    }

    @GetMapping("/customer/create")
    public ModelAndView newCustomer() {
        return new ModelAndView("create", "customer", new Customer());
    }

    @GetMapping("/customer/{id}/edit")
    public ModelAndView showEdit(@PathVariable int id) {
        return new ModelAndView("edit","customer",customerService.findById(id));
    }

    @GetMapping("/customer/{id}/delete")
    public ModelAndView showDelete(@PathVariable int id) {
        return new ModelAndView("delete","customer",customerService.findById(id));
    }

    @GetMapping("/customer/{id}/view")
    public ModelAndView showView(@PathVariable int id){
        return new ModelAndView("view","customer",customerService.findById(id));
    }


    @PostMapping("/customer/save")
    public String saveCustomer(Customer customer, RedirectAttributes redirectAttributes) {
        customer.setId((int) Math.random() * 1000);
        customerService.save(customer);
        redirectAttributes.addFlashAttribute("success","Saved customer successfully!");
        return "redirect:/";
    }

    @PostMapping("/customer/update")
    public String updateCustomer(Customer customer,RedirectAttributes redirectAttributes) {
        customerService.update(customer.getId(), customer);
        redirectAttributes.addFlashAttribute("success","Modified customer successfully!");
        return "redirect:/";
    }

    @PostMapping("/customer/delete")
    public String removeCustomer(Customer customer,RedirectAttributes redirectAttributes) {
        customerService.remove(customer.getId());
        redirectAttributes.addFlashAttribute("success","Removed customer successfully!");
        return "redirect:/";
    }
}
