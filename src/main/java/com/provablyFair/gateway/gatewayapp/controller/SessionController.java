package com.provablyFair.gateway.gatewayapp.controller;

import com.provablyFair.gateway.gatewayapp.model.SessionRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/sessions")
public class SessionController {

    private static final String GATEWAY_URL = "http://localhost:8080/";

    @PostMapping
    public void handleSessionsRequest(@RequestBody SessionRequest request, ServerHttpResponse response) {
        System.out.println("request is"+ request);
        final String url = GATEWAY_URL + "?game=" + request.getGame();
        response.setHeader("Location", GATEWAY_URL);
       // response.setStatus(HttpStatus.PERMANENT_REDIRECT.value());
    }
}
