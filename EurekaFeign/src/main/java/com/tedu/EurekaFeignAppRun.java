package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
@SpringCloudApplication
@EnableFeignClients
public class EurekaFeignAppRun {
  
   
	public static void main(String[] args) {
		
SpringApplication.run(EurekaFeignAppRun.class, args);
	}

}
