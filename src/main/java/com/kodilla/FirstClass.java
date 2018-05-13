package com.kodilla;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FirstClass {

    public static int suma(List<Integer> list) {

        int suma = 0;
        for(Integer temporary: list) {
            suma += temporary;
        }
        return suma;
    }

    public static void main(String[] args) {
        List<Integer> listaArray = new ArrayList<>();
        List<Integer> listaLinked = new LinkedList<>();


        listaArray.add(1);
        listaArray.add(3);
        listaArray.add(13);

        listaLinked.add(6);
        listaLinked.add(18);
        listaLinked.add(8);

        System.out.println(suma(listaArray));
        System.out.println(suma(listaLinked));

    }
}
