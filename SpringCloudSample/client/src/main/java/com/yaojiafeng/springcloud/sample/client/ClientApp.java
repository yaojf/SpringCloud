package com.yaojiafeng.springcloud.sample.client;

import com.yaojiafeng.springcloud.sample.api.ComputeApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by yaojiafeng on 2019/3/21 5:50 PM.
 */
@Controller
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.yaojiafeng.springcloud.sample.api"})
public class ClientApp {

    @Autowired
    private ComputeApi computeApi;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    @ResponseBody
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return computeApi.add(a, b);
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientApp.class, args);
    }

}
