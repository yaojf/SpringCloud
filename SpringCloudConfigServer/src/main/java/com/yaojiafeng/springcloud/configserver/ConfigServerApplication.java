package com.yaojiafeng.springcloud.configserver;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author yaojiafeng
 * @create 2018-01-09 下午4:10
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigServerApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ConfigServerApplication.class).web(true).run(args);
    }

}