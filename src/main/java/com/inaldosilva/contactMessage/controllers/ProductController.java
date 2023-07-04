package com.inaldosilva.contactMessage.controllers;

import com.inaldosilva.contactMessage.entities.Department;
import com.inaldosilva.contactMessage.entities.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/products")

public class ProductController {
    @GetMapping
    public List<Product> getObjects() {
        Department d1 = new Department(1L, "Tech");
        Department d2 = new Department(2L, "Pet");

        Product p1 = new Product(1l, "Macbook Pro", 4000.0, d1);
        Product p2 = new Product(2L, "PC Gamer intel i7", 5900.0, d1);
        Product p3 = new Product(3L, "Mochila com Bolha", 300.0, d2);
        Product p4 = new Product(4L, "Monitor curvo 27 polegadas", 2790.0, d1);
        Product p5 = new Product(5L, "iPad mini 2nd gen.", 3199.0, d1);
        Product p6 = new Product(6L, "Bebedouro com fonte", 549.0, d2);
        Product p7 = new Product(7L, "Kit Teclado e mouse bluetooth", 179.0, d1);
        Product p8 = new Product(8L, "Placa mãe Gigabyte", 875.0, d1);
        Product p9 = new Product(9L, "Coleira com pingente", 96.0, d2);
        Product p10 = new Product(10L, "Shampoo para cães", 29.0, d2);

        return Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);
    }
}
