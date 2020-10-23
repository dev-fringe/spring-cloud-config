package dev.fringe;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.builder.SpringApplicationBuilder;

//@Import(SomeBean.clas)
//-Dspring.main.banner-mode=off
public class ConfigClientApplication implements InitializingBean {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ConfigClientApplication.class).run(args);
	}

	@Value("${config.server.testmessage}")
	private String message;

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println(message);
	}
}