package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;
import com.cherylorcutt.di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/4/2025
 **/
@Controller
public class MyController {
  private final GreetingService greetingService;

  public MyController() {
    this.greetingService = new GreetingServiceImpl();
  }

  public String sayHello() {
    System.out.println("I'm in the controller");
    return "Hello Everyone!!!";
  }
}
