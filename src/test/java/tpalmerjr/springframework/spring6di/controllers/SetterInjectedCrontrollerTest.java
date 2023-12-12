package tpalmerjr.springframework.spring6di.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tpalmerjr.springframework.spring6di.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedCrontrollerTest {

    SetterInjectedCrontroller setterInjectedCrontroller;

    @BeforeEach
    void setUp() {
        setterInjectedCrontroller = new SetterInjectedCrontroller();
        setterInjectedCrontroller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedCrontroller.sayHello());
    }
}
