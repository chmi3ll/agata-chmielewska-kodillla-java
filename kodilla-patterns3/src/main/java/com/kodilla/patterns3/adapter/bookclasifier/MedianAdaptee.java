package com.kodilla.patterns3.adapter.bookclasifier;

import com.kodilla.patterns3.adapter.bookclasifier.libraryb.Book;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.BookSignature;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.BookStatistics;
import com.kodilla.patterns3.adapter.bookclasifier.libraryb.Statistics;

import java.util.Map;

public class MedianAdaptee implements BookStatistics {

    public int averagePublicationYear(Map<BookSignature, Book> books) {
        BookStatistics statistics = new Statistics();
        return statistics.averagePublicationYear(books);
    }

    public int medianPublicationYear(Map<BookSignature, Book> books) {
        BookStatistics statistics = new Statistics();
        return statistics.medianPublicationYear(books);
    }
}
