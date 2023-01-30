package com.nt.config;

import java.util.Collections;

import org.springframework.context.annotation.Configuration;

import springfox.documentation.RequestHandler;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerDocsConfig {
  public Docket createDocket() {
	  return new Docket(DocumentationType.SWAGGER_2).//UI screen type
			  select()//to specify restController
			  .apis(RequestHandlerSelectors.basePackage("com.nt.controller"))//base pkg for rest controller
			  .paths(PathSelectors.regex("/student.*"))
			  .build()//build the docket obj
			  .useDefaultResponseMessages(true)
			  .apiInfo(getApiInfo());
  }
  private  ApiInfo getApiInfo() {
		Contact contact=new Contact("raja","http://www.HCL.com/tourist","natarazjavaarena@gmail.com");
		return  new ApiInfo("Tourist API",
				                            "Gives Info Tourist Activites", 
				                            "3.4.RELEASE",
				                            "http://www.hcl.com/license",
				                            contact,
				                            "GNU Public",
				                            "http://apache.org/license/gnu", 
				                            Collections.emptyList());
	}
}
