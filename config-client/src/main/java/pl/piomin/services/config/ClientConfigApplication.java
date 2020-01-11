package pl.piomin.services.config;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ClientConfigApplication {

	public static void main(String[] args) {
		new SpringApplicationBuilder(ClientConfigApplication.class).run(args);
	}

}
