package com.galvanize.tmo.paspringstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LibraryService {


    List<Book> books = new ArrayList<>();

    public List<Book> getAllBooks(){
        Collections.sort(books);
        return books;
    }

    public Book addBook(Book newBook){

        int newId = getAllBooks().size() + 1;

        newBook.setId(newId);

        books.add(newBook);

        return newBook;

    }

    public void deleteAllBooks(){

        books.removeAll(books);
    }

}

