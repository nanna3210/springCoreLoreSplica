package org.nanna.configuration;


import org.nanna.controller.LoginController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.nanna.controller","org.nanna.service"})
public class AppConfig {


    
}
