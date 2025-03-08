package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 **/
public class SetterInjectionController {
  private GreetingService greetingService;

  public void setGreetingService(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
