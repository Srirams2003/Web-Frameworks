package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Books;

public interface BookRepository extends JpaRepository<Books,Integer> {

}
