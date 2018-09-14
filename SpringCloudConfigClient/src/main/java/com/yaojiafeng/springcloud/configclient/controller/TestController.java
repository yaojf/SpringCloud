package com.yaojiafeng.springcloud.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yaojiafeng
 * @create 2018-01-09 下午4:39
 */
@RefreshScope
@RestController
public class TestController {

    @Value("${foo:form}")
    private String from;

    @RequestMapping("/from")
    public String from() {
        return this.from;
    }

}
