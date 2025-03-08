package com.cherylorcutt.di.services;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/4/2025
 **/
public class GreetingServiceImpl implements GreetingService{
  @Override
  public String sayGreeting() {
    return "Hello Everyone From Base Service";
  }
}
