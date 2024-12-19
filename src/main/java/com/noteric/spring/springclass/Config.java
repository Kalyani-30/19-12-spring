package com.noteric.spring.springclass;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

public class Config {

@Configuration
    @ComponentScan(basePackages = " com.noteric.spring.springclass")
    public class Appconfig{

}
  @Bean("string")
  public Department getDepartment(){
     Employee employee=new Employee( "kalyani",12,"Ts");
     Department department=new Department("HR",45,employee);
     return department;
  }

}
