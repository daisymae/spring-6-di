package com.cherylorcutt.di.services;

import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/4/2025
 **/
@Service // spring-managed component
public class GreetingServiceImpl implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello Everyone From Base Service";
  }
}
