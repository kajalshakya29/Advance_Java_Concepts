package com.telusko.SpringAnno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.telusko.SpringAnno")
public class AppConfig 
{
	/*@Bean
	public Samsung getPhone()
	{
		return new Samsung();
	}
	
	@Bean
	public MobileProcessor getCpu()
	{
		return new Snapdragon();
	}*/
}
