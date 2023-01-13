package org.nanna.controller;

import org.nanna.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginController {
    @Autowired
    ProductService productService;
    
    public String getServie() {
        
        return productService.getProductService ();
        
    }



}
