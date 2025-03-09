package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 *
 * This mimics what spring would do.
 * Can add assertion to verify no null property passed in.
 **/
@Controller // this is a spring-managed component
public class ConstructorInjectedController {
  private final GreetingService greetingService;

  public ConstructorInjectedController(@Qualifier("greetingServiceImpl") GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
