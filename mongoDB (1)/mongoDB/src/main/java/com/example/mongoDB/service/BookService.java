package com.example.mongoDB.service;

import com.example.mongoDB.DAO.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mongoDB.Entity.Book;

import java.util.Collection;

@Service

public class BookService {

    @Autowired
    private BookDAO bookDAO;

    public Collection<Book> getBooks(){
        return bookDAO.getBooks();
    }


    public Book createBooks (Book book){
        return bookDAO.createBooks(book);
    }


}
