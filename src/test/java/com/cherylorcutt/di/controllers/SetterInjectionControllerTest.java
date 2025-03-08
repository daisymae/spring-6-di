package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 **/
class SetterInjectionControllerTest {

  SetterInjectionController setterInjectionController;

  @BeforeEach
  void setUp() {
    setterInjectionController = new SetterInjectionController();
    // if forget to set this get NPE
    setterInjectionController.setGreetingService(new GreetingServiceImpl());
  }

  @Test
  void sayHello() {
    System.out.println(setterInjectionController.sayHello());
  }
}