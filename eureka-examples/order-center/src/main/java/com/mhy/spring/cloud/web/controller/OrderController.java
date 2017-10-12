package com.mhy.spring.cloud.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author mahaiyuan
 * @ClassName: OrderController
 * @date 2017-10-11 下午11:22
 */
@RestController
@RequestMapping("/order")
public class OrderController {

  @RequestMapping("/query")
  public String query(String orderId) {
    String result = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " , " + orderId;
    System.out.println(result);
    return result;
  }
}
