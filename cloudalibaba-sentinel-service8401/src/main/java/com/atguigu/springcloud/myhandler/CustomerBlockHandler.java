package com.atguigu.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entity.CommonResult;

/**
 * @author zjh
 * @date 2022/7/10 17:38
 */
public class CustomerBlockHandler {
    public static CommonResult handleException1(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler-----1");
    }

    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler-----2");
    }

}
