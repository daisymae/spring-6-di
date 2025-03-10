package com.cherylorcutt.di.controllers.datasource;

import com.cherylorcutt.di.services.datasource.DatasourceService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * {@code @author:}  corcutt
 * {@code @created:} 3/9/2025
 **/
@Controller
public class DatasourceController {
  private final DatasourceService datasourceService;

  public DatasourceController(@Qualifier("dataService") DatasourceService datasourceService) {
    this.datasourceService = datasourceService;
  }

  public String getDatasource() {
    return "You are in " + datasourceService.getDatasource() + " environment";
  }
}
