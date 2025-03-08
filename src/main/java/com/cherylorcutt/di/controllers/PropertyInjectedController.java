package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 * Manual way of DI - least optimal way.
 **/
@Controller // spring doesn't know what to do with this -- needs @Autowired
public class PropertyInjectedController {
  @Autowired // not recommended
  GreetingService greetingService;

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
