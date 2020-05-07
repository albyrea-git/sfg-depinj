package springframework.guru.sfgdepinj.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import springframework.guru.sfgdepinj.services.ConstructorGreetingService;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstructorInjectedController(new ConstructorGreetingService());

    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}