package com.cherylorcutt.di.services;

import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Service
public class GreetingServicePropertyInjected implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Friends don't let friends do property injection!!!";
  }
}
