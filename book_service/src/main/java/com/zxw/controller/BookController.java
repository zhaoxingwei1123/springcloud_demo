package com.zxw.controller;

import com.zxw.entity.Book;
import com.zxw.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Value("${server.port}")
    private long port;
    @Value("${spring.cloud.client.ip-address}")
    private String ip;

    @Autowired
    private IBookService bookService;

    @RequestMapping(value = "/book/{bookId}")
    public Book getBookById(@PathVariable int bookId){
        Book book = new Book();
        book.setBookId(String.valueOf(bookId));
        book.setAuthor("黄裳");
        book.setBookName("九阴真经");
        book.setIntroduction("天之道，损有余而补不足，是故虚胜实不足胜有余。");
        book.setRemark("ip为:"+ip+":"+port);
        return book;
    }
}
