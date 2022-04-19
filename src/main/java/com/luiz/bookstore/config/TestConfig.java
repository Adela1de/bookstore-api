package com.luiz.bookstore.config;

import com.luiz.bookstore.domain.Book;
import com.luiz.bookstore.domain.Category;
import com.luiz.bookstore.repositories.BookRepository;
import com.luiz.bookstore.repositories.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@RequiredArgsConstructor
@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    private final CategoryRepository categoryRepository;
    private final BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        Category cat1 = new Category(
                null,
                "Computing",
                "TI books");


        Book book1 = new Book(
                null,
                "1984",
                "George Orwell",
                "Guerra é paz",
                cat1
        );

        cat1.getBooks().addAll(Arrays.asList(book1));
        categoryRepository.saveAll(Arrays.asList(cat1));
        bookRepository.saveAll(Arrays.asList(book1));
    }
}
