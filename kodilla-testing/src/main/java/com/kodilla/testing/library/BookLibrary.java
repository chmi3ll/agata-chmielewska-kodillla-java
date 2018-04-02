package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;


    BookLibrary(LibraryDatabase libraryDatabase){
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBookWithCondition(String titleFragment){
        List<Book> bookList = new ArrayList<>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBookWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;

        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser user){

        List<Book> bookList = new ArrayList<>();
        if (user.getFirstname() == null || user.getLastname() == null || user.getPeselId()== null) return bookList;
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(user);
        if (user.getFirstname() != null && user.getLastname() != null && user.getPeselId() != null) return resultList;
        bookList=resultList;
        return bookList;
    }

}
