package com.yao.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yao.pojo.Books;
import com.yao.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    @Qualifier("bookServiceImpl")
    private BookService bookService;

    //查询全部书籍返回到也main
    @RequestMapping("/allBook")
    public String listBook(Model model){
        List<Books> list = bookService.queryAllBooks();
        model.addAttribute("list",list);

        return "allBook";
    }
    //跳转到添加书籍页面
    @RequestMapping("/toAddBookPage")
    public String toAddPage(){
        return "addBook";
    }
    //添加书籍的请求
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("addbooks=>"+books);
        int i = bookService.addBooks(books);
        if(i > 0){
            System.out.println("增加成功");
        }else{
            System.out.println("增加失败");
        }
        //重定向
        return "redirect:/book/allBook";
    }

    //跳转到修改书籍页面,使用rustful风格得到前端传过来的值
    @RequestMapping("/toUpdate/{bookID}")
    public String toUpdatePage(@PathVariable("bookID") int bookID,Model model){
        System.out.println("传过来要修改的书籍ID："+bookID);
        Books books = bookService.queryBookById(bookID);

        System.out.println("要修改的书籍信息:"+books);
        model.addAttribute("xBook",books);
        return "updateBook";
    }
    //修改书籍的请求
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        System.out.println("updateBook==>"+books);
        System.out.println("前端传过来的ID："+books.getBookID());
        int i = bookService.updateBookById(books);
        if(i > 0){
            System.out.println("修改成功");
        }else{
            System.out.println("修改失败");
        }
        return "redirect:/book/allBook";
    }
    //删除书籍的请求,使用rustful风格得到前端传过来的值
    @RequestMapping("/deleteBookById/{bookID}")
    public String deleteBook(@PathVariable("bookID") int bookID){
        int i = bookService.deleteBooksById(bookID);
        if(i > 0){
            System.out.println("删除成功");
        }else{
            System.out.println("删除失败");
        }
        return "redirect:/book/allBook";
    }
    //搜索书籍
    @RequestMapping("/queryBookName")
    public String queryBookByName(String queryBookName,Model model){
        List<Books> list = bookService.queryBookByName(queryBookName);
        model.addAttribute("list",list);
        if(list == null){
            model.addAttribute("error","未查到!!!");
        }

        return "queryBookNamePage";
    }
}
