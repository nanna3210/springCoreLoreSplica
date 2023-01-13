package org.nanna.aspect;
//import  org.aspe
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAspect {


    @Before ( "execution(* org.nanna.controller.DemoController.doubleValue(..))" )
    public void  before(){
        System.out.println ("hello ");
    }
}
