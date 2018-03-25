package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> theMapOfUsers =forum.getUserList().stream()
                .filter(user -> user.getSex() == 'M')
                .filter(user -> user.getAge() >= 20)
                .filter(user -> user.getPublicatedPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getId, user->user));

        System.out.println("# elements: " + theMapOfUsers.size());
        theMapOfUsers.entrySet().stream()
                .map(entry-> entry.getKey() + " : " + entry.getValue())
                .forEach(System.out::println);
    }
}