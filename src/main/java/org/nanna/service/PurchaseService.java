package org.nanna.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;



@Component
public class PurchaseService {
    
    
    private final ProductService productService;
    
    
    public PurchaseService ( @Lazy ProductService productService ) {
        this.productService = productService;
    }
}
