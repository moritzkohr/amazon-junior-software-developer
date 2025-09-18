package com.library.digilib;

import com.library.digilib.model.Book;
import com.library.digilib.repository.BookRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

import static org.assertj.core.api.Assertions.assertThat;

import org.springframework.http.HttpStatus;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import java.util.Optional;

//TODO 14: Create an integration test class BookControllerIntegrationTest in src/test/java/com/library/digilib.
//TODO 15: Annotate the class with @SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT) to load the Spring Boot context for testing using a random port.
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BookControllerIntegrationTest {

    private Long bookId;

    //TODO 16: Inject TestRestTemplate to make REST calls and BookRepository to make DB CRUD calls.
    @Autowired
    private TestRestTemplate restTemplate;
    @Autowired
    private BookRepository bookRepository;

    private final String baseURL = "/books";

    @BeforeEach
    public void setUp() {
        Book book = new Book();
        book.setAuthor("Author");
        book.setTitle("Title");
        book.setPublicationDate(new java.sql.Date(2024, 12, 10));
        book.setAvailable(true);
        bookRepository.save(book);
        bookId = book.getId();
    }

    @AfterEach
    public void tearDown() {
        bookRepository.deleteById(bookId);
    }

    //TODO 17: Create integration test methods for POST /books/{id}/borrow, POST /books/{id}/return, and GET /books/{id}.
    @Test
    public void integrationTestBorrowBook() {
        ResponseEntity<Book> response = restTemplate.postForEntity(baseURL + "/" + bookId + "/borrow", null, Book.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isEqualTo(bookId);
    }

    @Test
    public void integrationTestReturnBook() {
        Optional<Book> book = bookRepository.findById(bookId);
        Book borrowedBook = book.get();
        borrowedBook.setAvailable(false);
        bookRepository.save(borrowedBook);
        ResponseEntity<Book> response = restTemplate.postForEntity(baseURL + "/" + bookId + "/return", null, Book.class);
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isEqualTo(bookId);
        Assertions.assertTrue(response.getBody().isAvailable());
    }

}
