package guru.springframework.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
    private  SetterInjectedController setterInjectedController;

    @Before
    public void setUp() throws Exception {
        setterInjectedController=new SetterInjectedController();
        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
    }
}
