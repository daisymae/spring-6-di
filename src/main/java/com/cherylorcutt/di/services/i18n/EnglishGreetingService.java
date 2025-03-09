package com.cherylorcutt.di.services.i18n;

import com.cherylorcutt.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Profile("EN")
@Service("i18nService")
public class EnglishGreetingService implements GreetingService {
  @Override
  public String sayGreeting() {
    return "Hello World - EN";
  }
}
