package com.zxw.controller;

import com.zxw.feignClients.BookFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ShowController {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private BookFeignClient bookFeignClient;

    @Value("${spring.cloud.client.ip-address}")
    private String ip;
    @Value("${server.port}")
    private long port;

    @RequestMapping(value = "/show/{bookId}")
    public Map<String,Object> getBookById(@PathVariable("bookId") int bookId) {
        //Map<String,Object> result = restTemplate.getForObject("http://book-server/book-server/book/"+bookId,Map.class);
        Map<String,Object> result = bookFeignClient.getBookById(bookId);
        result.put("ip",ip+":"+port);
        return result;
    }
}
