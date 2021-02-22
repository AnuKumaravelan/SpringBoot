package com.example.mongoDB.DAO;

import com.example.mongoDB.Entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository  extends MongoRepository<Book, Integer> {

    //an empty Class is just fine for now, but later if you need to add like find by title or
    //other methods, you can define inside the class)
}
