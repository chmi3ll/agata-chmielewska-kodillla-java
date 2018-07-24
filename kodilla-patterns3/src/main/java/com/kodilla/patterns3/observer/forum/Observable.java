package com.kodilla.patterns3.observer.forum;

public interface Observable {

        void registerObserver(Observer observer);
        void notifyObservers();
        void removeObserver(Observer observer);
}
