//package com.provablyFair.gateway.gatewayapp.gateway;
//
//import org.springframework.cloud.gateway.route.RouteLocator;
//import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
//
//public class Gateway {
//
//    public RouteLocator routes(RouteLocatorBuilder builder) {
//        return builder.routes()
//                .route(r -> r.path("/")
//                        .uri("http://httpbin.org:80"))
//                .build();
//    }
//}
