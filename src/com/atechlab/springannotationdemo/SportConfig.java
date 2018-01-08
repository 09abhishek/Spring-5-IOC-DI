package com.atechlab.springannotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.atechlab.springdemo")
@PropertySource("classpath:sport.properties")
public class SportConfig {

//define bean for sad fortune service.
	@Bean
	public FortuneServices sadFortuneService(){
	 return new SadFortuneService();
 }

// define bean for the swim coach and Inject dependency.
@Bean
public Coach swimCoach() {
	return new SwimCoach(sadFortuneService()); 
}

	
}
