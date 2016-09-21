package com.packt.webstore.controller;

import com.packt.webstore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * author: nowicba2, date: 9/21/16.
 */
@Controller
public class OrderController {
    @Autowired
    private OrderService orderService;

    @RequestMapping("/order/{productId}/{count}")
    public String process(@PathVariable("productId") String productId,
                          @PathVariable("count") int count) {
        try {
            orderService.processOrder(productId, count);
        } catch(IllegalArgumentException e) {
            e.printStackTrace();
            return "redirect:/products";
        }
        return "redirect:/products";
    }
}
