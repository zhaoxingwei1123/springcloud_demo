package com.zxw.service.impl;

import com.zxw.dao.IBookDao;
import com.zxw.entity.Book;
import com.zxw.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "bookService")
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookDao bookDao;
    @Override
    public List<Book> selectAll() {
        return bookDao.selectAll();
    }

    @Override
    public Book selectById(int bookId) {
        return bookDao.selectById(bookId);
    }
}
