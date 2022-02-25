package com.example.springboottemplate.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
//    @Bean
//    public Docket createRestApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .apiInfo(apiInfo())
//                .enable(true)
//                .select()
//                .apis(RequestHandlerSelectors.basePackage("com.example.springboottemplate.controller"))
//                .paths(PathSelectors.regex("/controller.*"))
//                .build();
//    }
//
//    private ApiInfo apiInfo() {
//        return new ApiInfoBuilder()
//                .title("接口")
//                .description("描述")
//                .contact(new Contact("name", "url", "email"))
//                .version("1.0.0")
//                .build();
//    }

//    @Bean
//    public GroupedOpenApi publicApi() {
//        return GroupedOpenApi.builder()
//                .group("test_Flyway")
//                .pathsToMatch("com.example.springboottemplate.controller")
//                .build();
//    }
//
//    @Bean
//    public GroupedOpenApi adminApi() {
//        return GroupedOpenApi.builder()
//                .group("flyway_test")
//                .pathsToMatch("com.example.springboottemplate.controller")
//                .addOpenApiMethodFilter(method -> method.isAnnotationPresent(Controller.class))
//                .build();
//    }

    @Bean
    public OpenAPI openAPI() {
        return new OpenAPI()
                .info(new Info().title("接口")
                        .description("描述")
                        .version("1.0.0"));
    }

}
