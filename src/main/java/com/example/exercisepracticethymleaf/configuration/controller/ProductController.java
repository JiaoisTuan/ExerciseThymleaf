package com.example.exercisepracticethymleaf.configuration.controller;

import com.example.exercisepracticethymleaf.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class ProductController {
    @GetMapping("/product")
    public String showProduct(Model model) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Iphone", 35000.5, true));
        productList.add(new Product(2, "MacBook", 5000.2, true));
        productList.add(new Product(2, "Airpods", 3000.1, true));
        productList.add(new Product(2, "Apple Wacth", 96000.9, false));
        model.addAttribute("product", productList);
        return "product";


    }
    @GetMapping("/product/detail")
    public String detail(@RequestParam int id) {

        System.out.println("ID nhận được: " + id);

        return "detail";
    }
}
