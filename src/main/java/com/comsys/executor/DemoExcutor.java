package com.comsys.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by hasee on 2018/4/13.
 */
@Component
public class DemoExcutor {

    @Async
    public   void testAsyn(){
        System.out.println("async");
        System.out.println(Thread.currentThread().getId());
    }
}
