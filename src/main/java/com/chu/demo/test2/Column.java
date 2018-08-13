package com.chu.demo.test2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD})//作用域是类或者接口  
@Retention(RetentionPolicy.RUNTIME)//注解类型：运行时注解  
public @interface Column {  
  
    String value();//注解只有一个变量时 变量名必须为value  
  
}
