package com.example.graphql.repo;

import com.example.graphql.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface BookRepo extends JpaRepository<Book,Integer> {
}
