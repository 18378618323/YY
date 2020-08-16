package com.yao.service;

import com.yao.dao.BookMapper;
import com.yao.pojo.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(isolation = Isolation.READ_COMMITTED,
propagation = Propagation.REQUIRED,
readOnly = false)
@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookMapper bookMapper;

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int addBooks(Books books) {

        return bookMapper.addBooks(books);
    }

    @Override
    public int deleteBooksById(int id) {
        return bookMapper.deleteBooksById(id);
    }

    @Override
    public int updateBookById(Books books) {
        return bookMapper.updateBookById(books);
    }

    @Override
    public Books queryBookById(int id) {
        return bookMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return bookMapper.queryAllBooks();
    }

    @Override
    public List<Books> queryBookByName(String bookName) {
        return bookMapper.queryBookByName(bookName);
    }
}
