package com.cherylorcutt.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Primary
@Service
public class GreetingServicePrimary implements GreetingService{

  @Override
  public String sayGreeting() {
    return "Hello From the Primary Bean!";
  }
}
