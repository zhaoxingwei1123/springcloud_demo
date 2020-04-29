package com.zxw.dao;

import com.zxw.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "bookDao")
@Mapper
public interface IBookDao{
    public List<Book> selectAll();

    public Book selectById(int bookId);
}
