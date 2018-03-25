package com.kodilla.stream.forumuser;

import com.kodilla.stream.person.People;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> forumUsers = new ArrayList<>();

    public Forum(){
        forumUsers.add(new ForumUser(001, "johnek", 'M', 1995, 8, 1, 200));
        forumUsers.add(new ForumUser(004, "klucha", 'K', 1982, 3, 29, 32));
        forumUsers.add(new ForumUser(007, "gacek", 'M', 1954, 10, 17, 1));
        forumUsers.add(new ForumUser(002, "ziomek", 'M', 2001, 1, 2, 0));
    }
    public List<ForumUser> getUserList() {
        return new ArrayList<>(forumUsers);
    }
}
