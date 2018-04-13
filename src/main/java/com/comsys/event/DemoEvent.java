package com.comsys.event;

import org.springframework.context.ApplicationEvent;

/**
 * Created by hasee on 2018/4/13.
 */
public class DemoEvent extends ApplicationEvent {
    private  String msg;
    public DemoEvent(Object source,String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
