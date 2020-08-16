package com.yao.test;

import com.yao.dao.BookMapper;
import com.yao.pojo.Books;
import com.yao.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void tets(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookServiceImpl = (BookService)context.getBean("bookServiceImpl");
        List<Books> books = bookServiceImpl.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }

    }
    @Test
    public void tets2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");

        BookMapper bookMapper = (BookMapper)context.getBean(BookMapper.class);
        List<Books> books = bookMapper.queryAllBooks();
        for (Books book : books) {
            System.out.println(book);
        }

    }
}
