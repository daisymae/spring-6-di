package com.cherylorcutt.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Profile("prod")
@Service("dataService")
public class DatasourceServiceProd implements DatasourceService{
  @Override
  public String getDatasource() {
    return "PRODUCTION datasource";
  }
}
