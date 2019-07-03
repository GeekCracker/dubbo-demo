package com.dubbo.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@ComponentScan("com.dubbo")
@EnableDubbo(scanBasePackages="com.dubbo.service.impl")
@EnableAutoConfiguration
public class DubboProvider02Run {

	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(DubboProvider02Run.class);
		application.run(args);
	}
}
