package com.employee.config;

import static springfox.documentation.builders.PathSelectors.regex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class SwaggerConfig {
	
	
		@Bean
		public Docket newsApi() {
			return new Docket(DocumentationType.SWAGGER_2).select()
					.apis(RequestHandlerSelectors.basePackage("com.employee")).paths(regex("/.*"))
					.build()
					.apiInfo(apiInfo());
		}

		private ApiInfo apiInfo() {
			return new ApiInfoBuilder().title("Spring Test API").description("Nothing")
					.contact(new Contact("MOHIT ARYA", "mohit@gmail.com", "mohit@gmail.com"))
					.license("Apache License Version 2.0")
					.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0").build();
		}
}
