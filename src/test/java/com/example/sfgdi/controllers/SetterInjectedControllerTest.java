package com.example.sfgdi.controllers;

import com.example.sfgdi.services.ConstructorGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {
    SetterInjectedController setterInjectedController;
    @BeforeEach
    void setUp() {
        setterInjectedController=new SetterInjectedController();
        setterInjectedController.setGreetingService(new ConstructorGreetingServiceImpl());
    }
    @Test
    void getGreeting(){
        System.out.println(setterInjectedController.getGreeting());
    }
}