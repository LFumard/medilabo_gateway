/*package com.lfumard.medilabo_gateway.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
//import org.springframework.cloud.gateway.server.mvc.route.RouteLocator;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

//import static javax.management.MBeanServerFactory.builder;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;

@Configuration
public class GatewayConfig {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                // Routes pour le microservice Patient
                .route("patient", r -> r
                        .path("/patient/**")
                        .uri("http://localhost:8081"))
                .route("service_note", r -> r
                        .path("/service_note/**")
                        .uri("http://localhost:8082"))
                .route("assessment", r -> r
                        .path("/assessment/**")
                        .uri("http://localhost:8083"))
                .build();
    }
}
*/