package com.example.bookstoredemo.dao;

import com.example.bookstoredemo.entity.CustomerOrderBook;
import com.example.bookstoredemo.entity.OrderBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface CustomerOrderBookDao extends JpaRepository<CustomerOrderBook, Integer> {

//    Optional<CustomerOrderBook> findCustomerOrderBookByOrderCode(String orderCode);

    @Query("""
        select o from OrderBook o where o.customerOrderBook.customer.username = :username
    """)
    List<OrderBook> findOrderBookByCustomerName(String username);

}
