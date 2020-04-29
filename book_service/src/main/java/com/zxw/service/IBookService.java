package com.zxw.service;

import com.zxw.dao.IBookDao;
import com.zxw.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBookService {

    public List<Book> selectAll();

    public Book selectById(int bookId);
}
