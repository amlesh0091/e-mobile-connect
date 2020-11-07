package com.demo.hclconnect.MobileConnection.config;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Lists;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.ApiKey;
import springfox.documentation.service.AuthorizationScope;
import springfox.documentation.service.SecurityReference;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spi.service.contexts.SecurityContext;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.ApiKeyVehicle;
import springfox.documentation.swagger.web.SecurityConfiguration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	@Bean
	public Docket apiDocket() {
		return new Docket(DocumentationType.SWAGGER_2)
				.tags(new Tag("finance","Finance Related API")
						)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.demo.hclconnect.MobileConnection"))
				.paths(PathSelectors.regex("/.*"))
				.build()
				.apiInfo(apiEndPointsInfo())
				.securityContexts(Lists.newArrayList(securityContext()))
				.securitySchemes(Collections.singletonList(apiKey()));
	}

	@Bean SecurityConfiguration security() {
		return new SecurityConfiguration(
				null, null,
				"realm", // realm Needed for authenticate button to work
				"appName", // appName Needed for authenticate button to work 
				null,// apiKeyValue 
				ApiKeyVehicle.HEADER,
				"Authorization", //apiKeyName
				null); }

	private ApiKey apiKey() {
		return new ApiKey("Authorization", "Authorization", "header");
	}
	private SecurityContext securityContext() {
		return SecurityContext.builder()
				.securityReferences(defaultAuth())
				.forPaths(PathSelectors.regex("/.*"))
				.build();
	}

	List<SecurityReference> defaultAuth() {
		AuthorizationScope authorizationScope
		= new AuthorizationScope("global", "accessEverything");
		AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
		authorizationScopes[0] = authorizationScope;
		return Lists.newArrayList(
				new SecurityReference("Authorization", authorizationScopes));
	}
	private ApiInfo apiEndPointsInfo() {
		return new ApiInfoBuilder().title("HCL Mobile Connection REST API")
				.description("API's for Communicating with HCL Mobile Connection Module")
				.version("1.0.0")
				.build();
	}	
}