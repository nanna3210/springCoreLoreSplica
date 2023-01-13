package org.nanna;

import org.nanna.configuration.AppConfig;
import org.nanna.service.ProductService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main ( String[] args ) {
        
        
        var context = new AnnotationConfigApplicationContext ( AppConfig.class );
        context.getBean ( ProductService.class );
//        System.out.println (productController);
    
    }
}