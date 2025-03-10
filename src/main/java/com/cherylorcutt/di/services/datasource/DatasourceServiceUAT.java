package com.cherylorcutt.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Profile("uat")
@Service("dataService")
public class DatasourceServiceUAT implements DatasourceService{
  @Override
  public String getDatasource() {
    return "UAT datasource";
  }
}
