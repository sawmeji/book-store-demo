package com.example.bookstoredemo.dao;

import com.example.bookstoredemo.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CustomerDao extends JpaRepository<Customer, Integer> {

    Optional<Customer> findCustomerByUsername(String username);
}
