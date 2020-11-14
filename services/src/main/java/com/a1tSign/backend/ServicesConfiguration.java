package com.a1tSign.backend;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

  @Configuration
  @ComponentScan (basePackageClasses = ServicesConfiguration.class)
  @Import ({DataBaseConfig.class})
  public class ServicesConfiguration {
  }
