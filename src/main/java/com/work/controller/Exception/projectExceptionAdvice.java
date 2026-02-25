package com.work.controller.Exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
//这里一定要被加载到，去spring里面看ComponentScan是否加载到，如果写了就是加载到了，如果放在其他包下需要在大括号添加
public class projectExceptionAdvice {
//    @ExceptionHandler(Exception.class)
    //拦截什么异常
//    public void doException(Exception e){
//        System.out.println("我抓到了"+e);
//
//    }
}
