package tpalmerjr.springframework.spring6di.controllers;

import tpalmerjr.springframework.spring6di.services.GreetingService;

public class SetterInjectedCrontroller {
    private GreetingService greetingService;

    public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
