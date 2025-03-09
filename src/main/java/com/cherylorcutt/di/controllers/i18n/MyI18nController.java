package com.cherylorcutt.di.controllers.i18n;

import com.cherylorcutt.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Controller
public class MyI18nController {
  private final GreetingService greetingService;

  public MyI18nController(@Qualifier("i18nService")
                          GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  public String sayHello() {
    return greetingService.sayGreeting();
  }
}
