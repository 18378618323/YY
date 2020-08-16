package com.yao.service;

import com.yao.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BookService {
    //增加
    int addBooks(Books books);
    //删除
    int deleteBooksById(int id);
    //更新
    int updateBookById(Books books);
    //查询一本
    Books queryBookById(int id);
    //查询全部
    List<Books> queryAllBooks();
    //搜索书籍
    List<Books> queryBookByName(String bookName);
}
