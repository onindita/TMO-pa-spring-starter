package com.galvanize.tmo.paspringstarter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Books {


    private List <Book> books;


    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        Collections.sort(books);
        return books;
    }


}
