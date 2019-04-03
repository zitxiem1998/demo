package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.ProductService;
import com.codegym.service.ProductServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ProductController {
    ProductService productService = new ProductServiceImpl();

    @GetMapping("/")
    public ModelAndView showList() {
        return new ModelAndView("index", "products", productService.findAll());
    }

    @GetMapping("/product/create")
    public ModelAndView showCreate() {
        return new ModelAndView("create", "product", new Product());
    }

    @GetMapping("/product/{id}/edit")
    public ModelAndView showEdit(@PathVariable int id) {
        return new ModelAndView("edit", "product", productService.findById(id));
    }

    @GetMapping("/product/{id}/delete")
    public ModelAndView showDelete(@PathVariable int id) {
        return new ModelAndView("delete", "product", productService.findById(id));
    }

    @GetMapping("/product/{id}/view")
    public ModelAndView showView(@PathVariable int id) {
        return new ModelAndView("view", "product", productService.findById(id));
    }


    @PostMapping("/product/save")
    public String saveProduct(Product product, RedirectAttributes redirectAttributes) {
        product.setId((int) Math.random() * 1000);
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Saved customer successfully!");
        return "redirect:/";
    }

    @PostMapping("/product/update")
    public String updateProduct(Product product, RedirectAttributes redirectAttributes) {
        productService.update(product.getId(), product);
        redirectAttributes.addFlashAttribute("success", "Modified customer successfully!");
        return "redirect:/";
    }

    @PostMapping("/product/delete")
    public String deleteProduct(Product product, RedirectAttributes redirectAttributes) {
        productService.remove(product.getId());
        redirectAttributes.addFlashAttribute("success", "Removed customer successfully!");
        return "redirect:/";
    }
}
