package com.yaojiafeng.springcloud.sample.server;

import com.yaojiafeng.springcloud.sample.api.ComputeApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yaojiafeng on 2019/3/21 5:50 PM.
 */
@Controller
@EnableDiscoveryClient
@SpringBootApplication
public class ServerApp implements ComputeApi {

    @Override
    @ResponseBody
    public String add(Integer a, Integer b) {
        return "a+b";
    }

    public static void main(String[] args) {
        SpringApplication.run(ServerApp.class, args);
    }

}
