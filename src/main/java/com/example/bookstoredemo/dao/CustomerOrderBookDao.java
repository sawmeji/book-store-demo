package com.example.bookstoredemo.dao;

import com.example.bookstoredemo.entity.CustomerOrderBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerOrderBookDao extends JpaRepository<CustomerOrderBook, Integer> {

//    Optional<CustomerOrderBook> findCustomerOrderBookByOrderCode(String orderCode);
}
