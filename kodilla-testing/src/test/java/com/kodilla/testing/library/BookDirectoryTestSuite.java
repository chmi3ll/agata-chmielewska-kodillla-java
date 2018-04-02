package com.kodilla.testing.library;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class BookDirectoryTestSuite {
    @Test
    public void testListBooksWithConditionsReturnList() {

        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", 2010);
        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);
        when(libraryDatabaseMock.listBookWithCondition("Secret"))
                .thenReturn(resultListOfBooks);

        //When
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");

        //Then
        assertEquals(4, theListOfBooks.size());
    }


    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }


    @Test
    public void testListBooksWithConditionMoreThan20() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);
        //anyString - dowolny tekst
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf15Books);
        //jako parametr (wozrzec wyszukiwania) zostanie podane "ZeroBooks"
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks"))
                .thenReturn(resultListOf0Books);
        //jako parametr (wzorzec wyszukiwania zostanie podany tekst "FortyBooks"
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks"))
                .thenReturn(resultListOf40Books);
        // When
        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");
        // Then

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());
    }

    @Test
    public void testListBooksWithConditionFragmentShorterThan3() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf10Books = generateListOfNBooks(10);
        when(libraryDatabaseMock.listBookWithCondition(anyString()))
                .thenReturn(resultListOf10Books);

        //When
        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");

        //Then
        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());
    }


//-----------------------------------------------------------------------------------------
    @Test
    public void testListBooksInHandsOfNoBooks() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();

        LibraryUser libraryUser2 = new LibraryUser("Robert", "Cook", "770112873");
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(resultListOf0Books);

        //When
        List<Book> theListOfBooks0 = bookLibrary.listBooksInHandsOf(libraryUser2);

        //Then
        assertEquals(0, theListOfBooks0.size());

    }



    @Test
    public void testListBooksInHandsOf1Book() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf0Books = new ArrayList<>();
        List<Book> resultListOf1Books = new ArrayList<>();
        resultListOf1Books.add(new Book("Secrets of Alamo", "John Smith", 2008));
        LibraryUser libraryUser2 = new LibraryUser("Robert", "Cook", "770112873");
        LibraryUser libraryUser3 = new LibraryUser(null, null, null);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(resultListOf1Books);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3))
                .thenReturn(resultListOf0Books);
        //When
        List<Book> theListOf1Book = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theListOf0Book = bookLibrary.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(1, theListOf1Book.size());
        assertEquals(0, theListOf0Book.size());
    }
    @Test
    public void testListBooksInHandsOf5Books() {
        //Given
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOf5Books = generateListOfNBooks(5);
        List<Book> resultListOf0Books = new ArrayList<>();
        LibraryUser libraryUser2 = new LibraryUser("Robert", "Cook", "770112873");
        LibraryUser libraryUser3 = new LibraryUser(null, null, null);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser2))
                .thenReturn(resultListOf5Books);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser3))
                .thenReturn(resultListOf0Books);

        //When
        List<Book> theListOf5Book = bookLibrary.listBooksInHandsOf(libraryUser2);
        List<Book> theListOf0Book = bookLibrary.listBooksInHandsOf(libraryUser3);

        //Then
        assertEquals(5, theListOf5Book.size());
        assertEquals(0, theListOf0Book.size());
    }
}