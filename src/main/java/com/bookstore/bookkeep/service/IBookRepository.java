package com.bookstore.bookkeep.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bookstore.bookkeep.entity.BookEntity;

@Repository
public interface IBookRepository extends JpaRepository<BookEntity, Integer>{

}
