package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author zjh
 * @date 2022/7/3 9:24
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "----------PaymentFallbackService fall back-paymentInfo_OK o(╥﹏╥)o";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "----------PaymentFallbackService fall back-paymentInfo_TimeOut o(╥﹏╥)o";
    }
}
