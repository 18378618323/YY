package com.yao.dao;

import com.yao.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {
    //增加
    int addBooks(Books books);
    //删除
    int deleteBooksById(@Param("id") int id);
    //更新
    int updateBookById(Books books);
    //查询一本
    Books queryBookById(@Param("id")int id);
    //查询全部
    List<Books> queryAllBooks();
    //搜索书籍
    List<Books> queryBookByName(@Param("bookName") String bookName);
}
