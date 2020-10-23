package dev.fringe.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@EnableConfigServer
@EnableAutoConfiguration
@Configuration
@PropertySource("classpath:application.properties")
public class Config {

	@Bean
	public SpringApplicationBuilder builder(){
		return new SpringApplicationBuilder(Config.class);
	}	
}
