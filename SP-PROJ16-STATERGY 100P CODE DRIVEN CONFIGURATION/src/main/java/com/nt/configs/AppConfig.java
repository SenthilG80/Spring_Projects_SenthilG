package com.nt.configs;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configurable
@ComponentScan(basePackages = "com.nt")
@ImportResource("classpath:com/nt/cfgs1/applicationContext.xml")
@PropertySource("com/nt/commons/info.properties")
public class AppConfig {

}
