package com.zxw.feignClients;

import com.zxw.feignClients.callback.BookFeignClientCallBack;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(name = "book-server",fallback = BookFeignClientCallBack.class)
public interface BookFeignClient {
    @RequestMapping("/book-server/book/{bookId}")
    public Map<String,Object> getBookById(@PathVariable("bookId") int bookId);
}
