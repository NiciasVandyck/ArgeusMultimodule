package be.argeus.multimodule;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class MultiModuleSample extends SpringBootServletInitializer {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(MultiModuleSample.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(MultiModuleSample.class);
	}
}
