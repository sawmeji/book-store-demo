package com.example.bookstoredemo.controller;

import com.example.bookstoredemo.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller("user_book_controller")
@RequestMapping("/user")
public class BookController {
    @Autowired
    private BookDao bookDao;

    @GetMapping("/book/all")
    public String listAllBooks(Model model){
        model.addAttribute("books", bookDao.findAll());
        return "show-all-books";
    }

}
