package com.example.centralizedconfigurationclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * centralized-configuration-client
 * 2020/10/30 下午 02:17
 * controller
 *
 * @author Joe
 **/

@RefreshScope
@RestController
public class TestController {

    @Value("${message:Hello default}")
    private String message;

    @RequestMapping("/message")
    String getMessage() {
        return this.message;
    }
}
