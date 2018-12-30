package com.kodilla.testing.forum.statistics;

import java.util.List;

public interface Statistics {
    List<String> userNames(); //list of user names
    int postCount(); //total quantity of forumm posts
    int commentsCount(); //total quantity of forumm comments

}
