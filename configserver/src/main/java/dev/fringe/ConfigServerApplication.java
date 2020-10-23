package dev.fringe;

import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Import;

import dev.fringe.config.Config;


@Import(Config.class)
public class ConfigServerApplication implements InitializingBean{
	
	@Autowired SpringApplicationBuilder builder;
	
	private String[] args = {};
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigServerApplication.class);
        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
 
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		builder.run(args);
	}
}