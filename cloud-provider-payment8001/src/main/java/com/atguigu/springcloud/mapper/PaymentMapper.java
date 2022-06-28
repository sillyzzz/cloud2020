package com.atguigu.springcloud.mapper;

import com.atguigu.springcloud.entity.Payment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
* @author 曾
* @description 针对表【payment】的数据库操作Mapper
* @createDate 2022-06-28 22:00:27
* @Entity com.atguigu.springcloud.entity.Payment
*/
@Mapper
public interface PaymentMapper extends BaseMapper<Payment> {

}




