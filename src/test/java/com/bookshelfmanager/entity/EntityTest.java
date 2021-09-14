package com.bookshelfmanager.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;


public class EntityTest {
    private static Author author;
    private static Book book;

    /*
        @BeforeEach
        author = new Author("Davy", "Jones", LocalDate.parse("1657-02-01"));   <- not working somehow... test throw nullpointer exceptions
     */



    @Test
    public void authorClassFunctionalityTest1_assertsTrue(){
        author = new Author("Davy", "Jones", LocalDate.parse("1657-02-01"));
        String testName = "Davy";
        boolean fNameEquals = author.getFirstName().equals(testName);
        assertTrue(fNameEquals);
    }

    @Test
    public void authorClassFunctionalityTest2_assertsTrue() {
        author = new Author("Davy", "Jones", LocalDate.parse("1657-02-01"));
        boolean sNameEquals = author.getLastName().equals("Jones");
        assertTrue(sNameEquals);
    }

    @Test
    public void authorClassFunctionalityTest3_assertsTrue() {
        author = new Author("Davy", "Jones", LocalDate.parse("1657-02-01"));
        String testDate = "1657-02-01";
        boolean bDateEquals = author.getDateOfBirth().equals(LocalDate.parse(testDate));
    }

    // Should also add before each book construction that gets the before each author


    @Test
    public void bookClassFunctionalityTest1_assertsTrue() {
        book = new Book("Dead Man Tell No Tales", author);
        String testTitle = "Dead Man Tell No Tales";
        boolean testTitleEqualsTitle = book.getTitle().equals(testTitle);
        assertTrue(testTitleEqualsTitle);
    }


    @Test
    public void bookClassFunctionalityTest2_assertsTrue(){
        book = new Book("Dead Man Tell No Tales", author);
        String authorFirstName = "Davy";
        boolean authFirstNameEquals = book.getAuthor().getFirstName().equals(authorFirstName);
        assertTrue(authFirstNameEquals);
    }

    //TODO : Implement remaining cross calls for book author properties

}
