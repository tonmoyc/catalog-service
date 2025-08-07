package com.polarbookshop.catalogservice;

import com.polarbookshop.catalogservice.domain.Book;
import com.polarbookshop.catalogservice.domain.BookService;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
public class BookDataLoader {

    private final BookService bookService;

    public BookDataLoader(BookService bookService) {
        this.bookService = bookService;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        System.out.println("Loading test data for books...");

        var book1 = new Book("1234567890", "Northern Lights", "Lyra Silverstar", 9.90);
        var book2 = new Book("1234567891", "Polar Journey", "Iorek Byrnison", 12.90);

        bookService.addBookToCatalog(book1);
        bookService.addBookToCatalog(book2);

        System.out.println("Test data loading completed.");
    }



}
