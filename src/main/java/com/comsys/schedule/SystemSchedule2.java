package com.comsys.schedule;

import com.comsys.event.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * 系统定时任务
 * @author wyd
 *
 */
//@Service

public class SystemSchedule2 {
    @Autowired
    DemoPublisher demoPublisher;

	@Scheduled(cron="0/5 * * * * *")
    public void say2(){
    	System.out.println("sys2 ok");
    	
    }


    @Scheduled(cron="0/5 * * * * *")
    public void testEvent(){
        demoPublisher.publish("test2");

    }

}
