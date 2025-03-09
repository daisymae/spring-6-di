package com.cherylorcutt.di.controllers.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@ActiveProfiles("ES")
@SpringBootTest
public class MyI18nControllerESTest {

  @Autowired
  MyI18nController myI18nController;

  @Test
  void sayHello() {
    System.out.println(myI18nController.sayHello());
  }
}
