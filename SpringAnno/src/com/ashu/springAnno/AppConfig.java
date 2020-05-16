package com.ashu.springAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.ashu.springAnno")
public class AppConfig {

	/*
	 * @Bean public Samsung getPhone() {
	 * 
	 * return new Samsung(); }
	 * 
	 * @Bean public MobileProcessor getProcessor() {
	 * 
	 * return new Snapdragon(); }
	 */
}
