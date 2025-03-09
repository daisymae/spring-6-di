package com.cherylorcutt.di.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Qualifier("setterGreetingBean")
@Service
public class GreetingServiceSetterInjection implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hey I'm Setting a Greeting!!";
  }
}
