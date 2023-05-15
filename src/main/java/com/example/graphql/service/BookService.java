package com.example.graphql.service;

import com.example.graphql.entity.Book;
import com.example.graphql.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class BookService {
    @Autowired
    private BookRepo bookRepo;

    public List<Book> getAllBook(){
        return  bookRepo.findAll();
    }

    public Optional<Book> getBookById(int bookId){
        return  bookRepo.findById(bookId);
    }

    public Book saveBook(Book book){
        return  bookRepo.save(book);
    }
}
