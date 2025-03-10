package com.cherylorcutt.di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Profile({"dev", "default"} )
@Service("dataService")
public class DatasourceServiceDev implements DatasourceService{
  @Override
  public String getDatasource() {
    return "DEV datasource";
  }
}
