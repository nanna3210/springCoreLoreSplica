package org.nanna;

import org.nanna.configuration.AppConfig;
import org.nanna.controller.LoginController;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    
    public static void main ( String[] args ) {
        
        
        var context = new AnnotationConfigApplicationContext ( AppConfig.class );
        LoginController loginController = context.getBean (  LoginController.class );
        System.out.println (loginController.getServie ());
        
        
    }
}