package com.polarbookshop.catalogservice;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@Profile("testdata")
public class BookDataLoader {

    @EventListener(ApplicationReadyEvent.class)
    public void loadBookTestData() {
        System.out.println("Loading test data for books...");
    }

}
