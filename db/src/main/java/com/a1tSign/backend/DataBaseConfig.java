package com.a1tSign.backend;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan (basePackageClasses = DataBaseConfig.class)
@EnableJpaRepositories (basePackageClasses = DataBaseConfig.class)
@EntityScan (basePackageClasses = DataBaseConfig.class)
@EnableJpaAuditing
public class DataBaseConfig {

}
