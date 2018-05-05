package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {
    @Test
    public void testTaskAdd(){
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().addTask("task no 1");
        board.getInProgressList().addTask("task no 1");
        board.getInProgressList().addTask("task no 2");
        board.getDoneList().addTask("task no 1");
        board.getDoneList().addTask("task no 2");
        board.getDoneList().addTask("task no 3");
        //Then
        Assert.assertEquals(1, board.getToDoList().getTasks().size());
        Assert.assertEquals(2, board.getInProgressList().getTasks().size());
        Assert.assertEquals(3, board.getDoneList().getTasks().size());
    }
}
