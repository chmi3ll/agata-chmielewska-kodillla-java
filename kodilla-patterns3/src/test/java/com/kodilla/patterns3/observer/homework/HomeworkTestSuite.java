package com.kodilla.patterns3.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {

    @Test
    public void testHomeworkQueue() {
        //Given
        StudentsHomeworkQueue krzysiek = new StudentsHomeworkQueue("Krzysztof Majtek");
        StudentsHomeworkQueue renata = new StudentsHomeworkQueue("Renata Kwiecień");
        StudentsHomeworkQueue grzegorz = new StudentsHomeworkQueue("Grzegorz Dupa");
        TeachersHomeworkQueue t_kaja = new TeachersHomeworkQueue("Kaja");
        TeachersHomeworkQueue t_rysiek = new TeachersHomeworkQueue("Rysiek");
        krzysiek.registerObserver(t_kaja);
        renata.registerObserver(t_kaja);
        grzegorz.registerObserver(t_rysiek);
        //When
        krzysiek.addTask("zadanie 1");
        krzysiek.addTask("zadanie 2");
        renata.addTask("zadanie 6");
        grzegorz.addTask("zadanie 21");
        //Then
        Assert.assertEquals(3, t_kaja.getUpdateCount());
        Assert.assertEquals(1, t_rysiek.getUpdateCount());
    }
}
