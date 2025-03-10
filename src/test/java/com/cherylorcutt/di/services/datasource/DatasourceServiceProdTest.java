package com.cherylorcutt.di.services.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@ActiveProfiles({"prod", "EN"})
@SpringBootTest
class DatasourceServiceProdTest {

  @Autowired
  private DatasourceService datasourceService;
  @Test
  void getDatasource() {
    System.out.println(datasourceService.getDatasource());
  }
}