package com.galvanize.tmo.paspringstarter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibraryController {

    @Autowired
    public LibraryService libraryService;

    @GetMapping("/health")
    public void health() {

    }

    @PostMapping("/api/books")
    @ResponseStatus(HttpStatus.CREATED)
    public Book addBooks(@RequestBody Book newBook){
        return libraryService.addBook(newBook);
    }

    @GetMapping("/api/books")
    public List<Book> getBooks(){
        return libraryService.getAllBooks();
    }

    @DeleteMapping("/api/books")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public String deleteBooks(){
        return libraryService.deleteAllBooks();
    }
}
