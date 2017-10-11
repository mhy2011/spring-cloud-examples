package com.mhy.spring.cloud.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mahaiyuan
 * @ClassName: HelloController
 * @date 2017-10-11 下午8:46
 */
@RestController
public class HelloController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello World";
  }
}
