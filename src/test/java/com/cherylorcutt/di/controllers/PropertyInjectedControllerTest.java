package com.cherylorcutt.di.controllers;

import com.cherylorcutt.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/8/2025
 **/
@SpringBootTest
class PropertyInjectedControllerTest {

  @Autowired
  PropertyInjectedController propertyInjectedController;

  @Test
  void sayHello() {
    System.out.println(propertyInjectedController.sayHello());
  }
}