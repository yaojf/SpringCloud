package com.yaojiafeng.springcloud.feign.client;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yaojiafeng
 * @create 2018-01-09 下午3:58
 */
@Component
public class ComputeClientHystrix implements ComputeClient {

    @Override
    public String add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
        return "error";
    }

}
