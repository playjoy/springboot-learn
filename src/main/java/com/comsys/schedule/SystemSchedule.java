package com.comsys.schedule;

import com.comsys.event.DemoPublisher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author wyd
 *
 */
@Service
@EnableScheduling
public class SystemSchedule {
    @Autowired
    DemoPublisher demoPublisher;

	@Scheduled(cron="0/5 * * * * *")
    public void say1(){
    	System.out.println("sys ok");
    	
    }


    @Scheduled(cron="0/5 * * * * *")
    public void testEvent(){
        demoPublisher.publish("test");

    }

}
