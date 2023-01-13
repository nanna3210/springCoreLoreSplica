package org.nanna;

import org.nanna.configuration.AppConfig;
import org.nanna.controller.DemoController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main ( String[] args ) {
        
        
        var context = new AnnotationConfigApplicationContext ( AppConfig.class );
        var nanna = context.getBean ( DemoController.class );
//        System.out.println (productController);
    
        nanna.doubleValue ( 23 );
    }
}