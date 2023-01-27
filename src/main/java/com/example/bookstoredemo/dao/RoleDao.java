package com.example.bookstoredemo.dao;

import com.example.bookstoredemo.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface RoleDao extends JpaRepository<Role, Integer> {

    Optional<Role> findRoleByRoleName(String roleName);
}
