package com.applications.virtual_assistant_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VirtualAssistantBackendApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(VirtualAssistantBackendApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(VirtualAssistantBackendApplication.class);
    }
}
