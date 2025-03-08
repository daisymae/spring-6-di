package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 **/
@Controller
public class SetterInjectionController {

  // putting @Autowired on the property will cause reflection to be used which is not performant
  private GreetingService greetingService;

  @Autowired
  public void setGreetingService(GreetingService greetingService) {
    System.out.println("SetterInjectedController.setGreetingService");
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
