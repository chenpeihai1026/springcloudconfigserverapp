package com.mk.springcloud.consumer.hello.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mk.springcloud.consumer.hello.HelloRemote;

@RestController
public class HelloConsumerController {

	@Autowired
	HelloRemote helloRemote;

	@RequestMapping("/hello/{name}")
	public String index(@PathVariable("name") String name) {
		return helloRemote.hello(name);
	}
}
