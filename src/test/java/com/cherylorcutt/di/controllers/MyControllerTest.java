package com.cherylorcutt.di.controllers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/4/2025
 **/
class MyControllerTest {

  @Test
  void sayHello() {
    MyController myController = new MyController();
    System.out.println(myController.sayHello());
  }
}