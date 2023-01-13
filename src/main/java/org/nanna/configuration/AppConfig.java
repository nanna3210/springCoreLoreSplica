package org.nanna.configuration;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = { "org.nanna.controller", "org.nanna.service","org.nanna.aspect" })
@EnableAspectJAutoProxy
public class AppConfig {
    

    
}
