package com.mk.springcloud.consumer.hello;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mk.springcloud.consumer.hello.impl.HelloRemoteHystrix;

@FeignClient(name="springcloud-producer",fallback = HelloRemoteHystrix.class)
public interface HelloRemote {
	
	@RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
