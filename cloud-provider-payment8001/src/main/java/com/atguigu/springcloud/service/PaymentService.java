package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entity.Payment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

/**
* @author 曾
* @description 针对表【payment】的数据库操作Service
* @createDate 2022-06-28 22:00:27
*/
public interface PaymentService extends IService<Payment> {
     int insert(Payment payment);

     Payment selectById(@Param("id")Long id);
}
