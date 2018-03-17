package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
        ArrayList<Integer> wynikowa = new ArrayList<Integer>();
        int temporaryValue = 0;
        for (int i = 0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                wynikowa.add(temporaryValue);
            }
        }
        return wynikowa;
    }
}

