package com.supermap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.supermap.cfgbeans.ConfigBean;
import com.supermap.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="SUPERMAP-DEPT",configuration=MySelfRule.class)
public class DetpConsumer80_App {
	
	public static void main(String[] args) {
		SpringApplication.run(DetpConsumer80_App.class, args);
	}
}
