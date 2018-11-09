package com.tedu.Service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("provider-user")
public interface EurekaServiceFeign {

	@RequestMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);
	
}
