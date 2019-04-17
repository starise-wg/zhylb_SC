package com.supermap.provider.entity;

import java.io.Serializable;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/*用于存放我们的实体类，需要与数据库字段名基本保持一致*/
@Data /* @Data 是 Lombok 的注解，会为这个类所有属性添加 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法。*/
@Component  /*自动添加 bean 到 spring 容器中*/
/*@ConfigurationProperties(prefix = "person")*/ /*告诉这个类的属性都是配置文件里的属性，prefix 指定读取配置文件的前缀*/
@Validated
public class User implements Serializable{ /*建立实体类实现序列化接口*/
	private String userName="WANGGANG";
	private String userPasssword;
	private int userAge;
	private int userDetp;
	private int userRole;
	private String userAddr; 
}
