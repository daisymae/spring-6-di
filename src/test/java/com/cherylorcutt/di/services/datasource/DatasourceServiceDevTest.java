package com.cherylorcutt.di.services.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
// have to set the i18n profile or will fail to run
@ActiveProfiles({"dev", "EN"})
@SpringBootTest
class DatasourceServiceDevTest {

  @Autowired
  DatasourceService datasourceService;
  @Test
  void getDatasource() {
    System.out.println(datasourceService.getDatasource());
  }
}