package com.kodilla.patterns3.adapter.bookclassifier;

import com.kodilla.patterns3.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns3.adapter.bookclasifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {

    @Test
    public void publicationYearMedianTest() {
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(new Book("ktos1", "cos1", 1990, "1234"));
        bookSet.add(new Book("ktos2", "cos2", 1991, "1235"));
        bookSet.add(new Book("ktos3", "cos3", 1993, "1236"));
        MedianAdapter adapter = new MedianAdapter();
        int median = adapter.publicationYearMedian(bookSet);

        Assert.assertEquals(1991, median);
    }
}
