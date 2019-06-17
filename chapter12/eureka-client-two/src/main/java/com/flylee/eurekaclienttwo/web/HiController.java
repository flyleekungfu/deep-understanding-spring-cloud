package com.flylee.eurekaclienttwo.web;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述：Hi控制层
 * 创建时间：2019/6/17 16:26
 *
 * @author lifei
 */
@RestController
public class HiController {
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    @HystrixCommand(fallbackMethod = "hiError")
    public String home(@RequestParam String name){
        return "hi "+name+",i am lucy and from port:"+port;
    }

    public String hiError(String name){
        return "hi, "+name+", sorry, error!";
    }
}
