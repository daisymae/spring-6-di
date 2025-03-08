package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 * Manual way of DI - least optimal way.
 **/
public class PropertyInjectedController {
  GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
