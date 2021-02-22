package com.example.mongoDB.DAO;

import com.example.mongoDB.Entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class BookDAO {
    @Autowired
    private BookRepository repository;

    public Collection<Book> getBooks(){
        return repository.findAll();

    }

    public Book createBooks(Book book){
return repository.insert(book);
    }


    public Book insert(Book book) {
        return book;
    }
}
