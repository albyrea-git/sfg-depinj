package springframework.guru.sfgdepinj.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.guru.sfgdepinj.services.ConstructorGreetingService;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}