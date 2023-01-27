package com.example.bookstoredemo.controller;

import com.example.bookstoredemo.dao.BookDao;
import com.example.bookstoredemo.entity.Book;
import com.example.bookstoredemo.entity.Customer;
import com.example.bookstoredemo.service.CartService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class AccountController {
    @Autowired
    private BookDao bookDao;

    @Autowired
    private CartService cartService;

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping({"/","/home"})
    public String home(){
        return "index";
    }

    @ModelAttribute("books")
    public List<Book> listBooks(){
        return bookDao.findAll();
    }
}
