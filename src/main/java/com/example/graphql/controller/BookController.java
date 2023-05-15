package com.example.graphql.controller;

import com.example.graphql.entity.Book;
import com.example.graphql.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    //@GetMapping("/findAllBook")
    @QueryMapping("allBooks")
    public List<Book> getAllBook(){
       return bookService.getAllBook();
    }

    //@GetMapping("/findByBook/{id}")
    @QueryMapping("getBook")
    public Book findByBookId(@Argument int bookId){
        Optional<Book> response = bookService.getBookById(bookId);
        if(response.isPresent()){
            return response.get();
        }
       return null;
    }

   // @PostMapping("/saveBook")
   // @ResponseBody
    @MutationMapping("createBook")
    public Book saveBook(@Argument BookInput book){
        Book b = new Book();
        b.setDesc(book.getDesc());
        b.setName(book.getName());
        b.setPage(book.getPage());
        b.setTitle(book.getTitle());
        b.setAuthor(book.getAuthor());
        b.setPrice(book.getPrice());
        return bookService.saveBook(b);
    }
}
