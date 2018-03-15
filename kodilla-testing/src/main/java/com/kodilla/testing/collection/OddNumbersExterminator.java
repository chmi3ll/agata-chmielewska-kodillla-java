package com.kodilla.testing.collection;

import java.util.*;

public class OddNumbersExterminator {

    public void exterminate(ArrayList<Integer> numbers) {

        int temporaryValue = 0;
        for (int i = 0; i < numbers.size(); i++) {
            temporaryValue = numbers.get(i);
            if (temporaryValue % 2 == 0) {
                numbers.add(temporaryValue);
            }
        }
    }

}

class Application {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(6);
        list.add(4);
        list.add(15);
        list.add(0);
        list.add(3);

    }
}

