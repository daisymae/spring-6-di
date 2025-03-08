package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 *
 * This mimics what spring would do.
 * Can add assertion to verify no null property passed in.
 **/
public class ConstructorInjectedController {
  private final GreetingService greetingService;

  public ConstructorInjectedController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
