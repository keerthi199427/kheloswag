package com.myworks.creation.kheloswag.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguration {
	
	ApiInfo apiInfo() {
		return new ApiInfoBuilder()
				.title("Khelo India App")
				.description("A new Age Sports")
				.license("test")
				.licenseUrl("test")
				.termsOfServiceUrl("test")
				.version("1.0.0")
				.contact(new Contact("test","www.google.com","abc@abc.com"))
				.build();
	}
	@Bean
	public Docket customImplementation() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.myworks.creation.kheloswag"))
				.build()
				.apiInfo(apiInfo());
	}

}
