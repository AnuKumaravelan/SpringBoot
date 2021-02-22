package com.example.mongoDB.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Book")
public class Book  {

    @Id
    private Integer id;
    private String Title, Author;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }



    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}
