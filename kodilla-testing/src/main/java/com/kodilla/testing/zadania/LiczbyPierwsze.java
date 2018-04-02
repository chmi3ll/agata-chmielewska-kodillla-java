package com.kodilla.testing.zadania;

public class LiczbyPierwsze {
    boolean liczbyPierwsze(int liczba){
        for(int i=2; i<=liczba/2; i++){
            if(liczba % i == 0){
                return false;
            }
        }
        return true;
    }
}
