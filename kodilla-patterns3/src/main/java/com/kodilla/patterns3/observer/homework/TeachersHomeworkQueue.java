package com.kodilla.patterns3.observer.homework;

public class TeachersHomeworkQueue implements Observer {
    private String name;
    private int updateCount;

    public TeachersHomeworkQueue(String name) {
        this.name = name;
    }

    @Override
    public void update(StudentsHomeworkQueue studentsHomeworkQueue) {
        System.out.println(name + " masz " + studentsHomeworkQueue.getTasks().size() + " nowych zadań od kursanta " +
        studentsHomeworkQueue.getName());
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
