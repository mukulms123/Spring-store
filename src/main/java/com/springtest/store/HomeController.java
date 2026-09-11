package com.springtest.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Autowired
    private OrderService orderService;

    @Value("${spring.application.name}")
    private String appName;

    @RequestMapping("/")
    public String index(){
        System.out.println("App Name: "+appName);
        orderService.placeOrder();
        return "index.html";
    }
}
