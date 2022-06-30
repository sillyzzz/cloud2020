package com.atguigu.springcloud.service.impl;

import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.mapper.PaymentMapper;
import com.atguigu.springcloud.service.PaymentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
* @author 曾
* @description 针对表【payment】的数据库操作Service实现
* @createDate 2022-06-28 22:00:27
*/
@Service
public class PaymentServiceImpl extends ServiceImpl<PaymentMapper, Payment>
    implements PaymentService{
    @Resource
    private  PaymentMapper paymentMapper;

    @Override
    public int insert(Payment payment){
        return paymentMapper.insert(payment);
    }

    @Override
    public Payment selectById(@Param("id")Long id){
        return paymentMapper.selectById(id);
    }

}




