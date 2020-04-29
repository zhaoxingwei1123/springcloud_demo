package com.zxw.feignClients.callback;

import com.zxw.feignClients.BookFeignClient;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class BookFeignClientCallBack implements BookFeignClient {
    @Override
    public Map<String, Object> getBookById(int bookId) {
        Map<String, Object> map = new HashMap<String,Object>();
        map.put("msg","服务发生了熔断");
        return map;
    }
}
