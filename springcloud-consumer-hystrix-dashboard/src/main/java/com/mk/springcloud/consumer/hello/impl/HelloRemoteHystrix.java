package com.mk.springcloud.consumer.hello.impl;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

import com.mk.springcloud.consumer.hello.HelloRemote;

@Component
public class HelloRemoteHystrix implements HelloRemote {

	@Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" +name+", this messge send failed ";
    }
}
