package com.kodilla.patterns3.adapter.bookclasifier;

import com.kodilla.patterns3.adapter.bookclasifier.librarya.Classifier;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.BookSignature;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {

    public int publicationYearMedian(Set<com.kodilla.patterns3.adapter.bookclasifier.librarya.Book> bookSet) {
        Map<BookSignature, com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book> books = new HashMap<>();
        for (com.kodilla.patterns3.adapter.bookclasifier.librarya.Book element : bookSet) {
            books.put(new BookSignature(element.getSignature()), new Book(element.getAuthor(), element.getTitle(), element.getPublicationYear()));
        }
        return medianPublicationYear(books);
    }
}
