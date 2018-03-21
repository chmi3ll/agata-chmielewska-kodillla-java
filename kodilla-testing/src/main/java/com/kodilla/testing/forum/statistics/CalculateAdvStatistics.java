package com.kodilla.testing.forum.statistics;

import java.util.ArrayList;
import java.util.List;

public class CalculateAdvStatistics {

    Statistics statistics;

    private int numberOfUsers;

    private int numberOfPosts;

    private int numberOfComments;

    private double userPostAverage;

    private double userCommentAverage;

    private double postCommentAverage;


    public CalculateAdvStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {

        numberOfUsers = statistics.userNames().size();

        numberOfPosts = statistics.postCount();

        numberOfComments = statistics.commentsCount();

        userPostAverage = statistics.postCount() / statistics.userNames().size();

        userCommentAverage = numberOfComments / numberOfUsers;

        postCommentAverage = numberOfComments / numberOfPosts;

    }

        public int getNumberOfUsers(){
            return numberOfUsers;
        }

        public int getNumberOfPosts(){
            return numberOfPosts;
        }

        public int getNumberOfComments(){
            return numberOfComments;
        }

        public double getUserPostAverage(){
            if (numberOfUsers!= 0){
                return userPostAverage;
            } else return 0;
        }

        public double getUserCommentAverage(){
            if(numberOfUsers!=0){
                return userCommentAverage;
            } else return 0;
        }

        public double getPostCommentAverage(){
            if(numberOfUsers!=0){
                return postCommentAverage;
            } else return 0;
        }


        //   public showStatistics() {

    }
