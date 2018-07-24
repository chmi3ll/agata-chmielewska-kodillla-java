package com.kodilla.patterns3.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class StudentsHomeworkQueue implements Observable {
    private List<Observer> teachers = new ArrayList<>();
    private Queue tasks = new ArrayDeque();
    private String name;

    public StudentsHomeworkQueue(String name) {
        this.name = name;
    }

    @Override
    public void registerObserver(Observer observer) {
        teachers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: teachers) {
            observer.update(this);
        }
    }

    public void addTask(String task) {
        tasks.offer(task);
        notifyObservers();
    }

    public Queue getTasks() {
        return tasks;
    }

    public String getName() {
        return name;
    }
}
