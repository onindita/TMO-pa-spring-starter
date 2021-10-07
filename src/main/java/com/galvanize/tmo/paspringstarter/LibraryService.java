package com.galvanize.tmo.paspringstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LibraryService {


    ArrayList<Book> booklist = new ArrayList<>();

    public List<Book> getAllBooks(){
        
        Collections.sort(booklist);
        return booklist;
    }



    public Book addBook(Book newBook){

        int newId = getAllBooks().size() + 1;

        newBook.setId(newId);

        booklist.add(newBook);

        return newBook;

    }

    public void deleteAllBooks(){

        booklist.removeAll(booklist);
    }



}

