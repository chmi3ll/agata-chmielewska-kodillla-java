package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        Library library = new Library("ksiazki nudne");
        Book book1 = new Book("Historia powszechna", "Andrzej Chwalba", LocalDate.of(1980, 12, 1));
        Book book2 = new Book("Historia sztuki XXI wieku", "Krzysztof Mikulski", LocalDate.of(1993, 3, 1));
        library.addBook(book1);
        library.addBook(book2);

        //making a shallow clone of object library
        Library clonedlibrary = null;

        try {
            clonedlibrary = library.shallowCopy();
            clonedlibrary.setName("jeszcze nudniejsze książki");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }

        //making a deep copy of obcject Library
        Library deepClonedLibrary = null;

        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("książki dla historyka");
        } catch (CloneNotSupportedException e){
            System.out.println(e);
        }
        Assert.assertEquals(2, library.getBooks().size());
        Assert.assertEquals(2, clonedlibrary.getBooks().size());
        Assert.assertEquals(2, deepClonedLibrary.getBooks().size());
    }
}
