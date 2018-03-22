package com.kodilla.testing.forum.statistics;

public class CalculateAdvStatistics {

    Statistics statistics;

    private double numberOfUsers;

    private double numberOfPosts;

    private double numberOfComments;

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

        if (statistics.userNames().size() == 0){
            userPostAverage = 0;
        } else {
            userPostAverage = statistics.postCount() / statistics.userNames().size();
        }

        if (statistics.userNames().size() == 0){
            userCommentAverage = 0;
        } else {
            userCommentAverage = numberOfComments / numberOfUsers;

        }

        if (statistics.postCount() == 0){
            postCommentAverage =0;
        } else {
            postCommentAverage = numberOfComments / numberOfPosts;
        }
    }

        public double getUserPostAverage(){
                return userPostAverage;
        }

        public double getUserCommentAverage(){
                return userCommentAverage;
        }

        public double getPostCommentAverage(){
                return postCommentAverage;
        }
        }
