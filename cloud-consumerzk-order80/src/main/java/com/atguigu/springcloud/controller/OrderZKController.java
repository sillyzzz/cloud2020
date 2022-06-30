package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author zjh
 * @date 2022/6/30 22:47
 */
@RestController
@Slf4j
public class OrderZKController {
    public static final String INVOKE_URL="http://cloud-provider-payment";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL+"/payment/zk", String.class);
        System.out.println("消费者调用支付服务(zookeeper)--->result:" + result);
        return result;
    }

}
