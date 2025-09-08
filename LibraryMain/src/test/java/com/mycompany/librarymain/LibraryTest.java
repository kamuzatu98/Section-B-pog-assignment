/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/EmptyTestNGTest.java to edit this template
 */
package com.mycompany.librarymain;

// LibraryTest.java (in test package)
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
    private Book[] books;
    private int bookCount;

    @BeforeEach
    public void setUp() {
        books = new Book[100];
        bookCount = 0;
    }

    @Test
    public void testAddFictionBook() {
        FictionBook fb = new FictionBook("B1", "Fiction Title", "Author", 2020, "Sci-Fi");
        books[bookCount++] = fb;
        assertEquals(1, bookCount);
        assertEquals("Fiction - Sci-Fi", books[0].getCategory());
    }

    @Test
    public void testAddNonFictionBook() {
        NonFictionBook nfb = new NonFictionBook("B2", "Non-Fiction Title", "Author", 2019, "History");
        books[bookCount++] = nfb;
        assertEquals(1, bookCount);
        assertEquals("Non-Fiction - History", books[0].getCategory());
    }

    @Test
    public void testSearchBookFound() {
        books[bookCount++] = new FictionBook("B1", "Title", "Author", 2020, "Genre");
        String found = null;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals("B1")) {
                found = books[i].getTitle();
            }
        }
        assertEquals("Title", found);
    }

    @Test
    public void testSearchBookNotFound() {
        String found = null;
        for (int i = 0; i < bookCount; i++) {
            if (books[i].getId().equals("B999")) {
                found = books[i].getTitle();
            }
        }
        assertNull(found);
    }
}