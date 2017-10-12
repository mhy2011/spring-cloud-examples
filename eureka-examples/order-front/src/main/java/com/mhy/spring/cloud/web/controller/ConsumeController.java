package com.mhy.spring.cloud.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author mahaiyuan
 * @ClassName: ConsumeController
 * @date 2017-10-11 下午11:34
 */
@RestController
public class ConsumeController {

  @Autowired
  private RestTemplate restTemplate;

  @RequestMapping("/helloOrder")
  public String helloOrder(String orderId) {
    String rs = restTemplate.getForEntity("http://ORDER-CENTER/order/query?orderId="+orderId, String.class).getBody();
    System.out.println(rs);
    return rs;
  }

}
