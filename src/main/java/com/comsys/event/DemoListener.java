package com.comsys.event;

import com.comsys.executor.DemoExcutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * Created by hasee on 2018/4/13.
 */
@Component
public class DemoListener implements ApplicationListener<DemoEvent> {
    @Autowired
    DemoExcutor demoExcutor;

    @Override
    public void onApplicationEvent(DemoEvent demoEvent) {
        String msg = demoEvent.getMsg();
        System.out.println(msg);

        System.out.println(Thread.currentThread().getId());
        demoExcutor.testAsyn();
    }

}
