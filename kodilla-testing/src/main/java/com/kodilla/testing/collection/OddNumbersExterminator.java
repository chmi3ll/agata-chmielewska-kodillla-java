package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public ArrayList exterminate(ArrayList<Integer> numbers) {

        int temporaryValue = 0;
        for (int i = 0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                numbers.add(temporaryValue);
            }
        }
    return numbers;
    }

}

