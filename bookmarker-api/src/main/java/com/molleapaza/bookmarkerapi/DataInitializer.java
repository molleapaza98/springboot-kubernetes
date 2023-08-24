package com.molleapaza.bookmarkerapi;

import com.molleapaza.bookmarkerapi.domain.Bookmark;
import com.molleapaza.bookmarkerapi.domain.BookmarkRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
@RequiredArgsConstructor
public class DataInitializer implements CommandLineRunner {

    private final BookmarkRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Quarkus", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Micronaut", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "SpringBlog", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Quarkus", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Micronaut", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "SpringBlog1", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Quarkus1", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Micronaut2", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "SpringBlog3", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Quarkus4", "https://spring.io/blog", Instant.now() ));
        repository.save(new Bookmark(null, "Micronaut1", "https://spring.io/blog", Instant.now() ));

    }
}
