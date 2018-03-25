package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    final int id;
    final String name;
    final char sex;
    final LocalDate birthDate;
    final int publicatedPosts;

    public ForumUser(int id, String name, char sex, int yearOfBirth, int monthOfBirth, int dayOfBirth, int publicatedPosts) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.birthDate = LocalDate.of(yearOfBirth, monthOfBirth, dayOfBirth);
        this.publicatedPosts = publicatedPosts;
    }

    public int getId() {
        return id;
    }

    public char getSex() {
        return sex;
    }

    public int getAge() {
        LocalDate currentDate = LocalDate.now();
        int result = currentDate.getYear() - birthDate.getYear();
        return result;
    }

    public int getPublicatedPosts() {
        return publicatedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", publicatedPosts=" + publicatedPosts +
                '}';
    }
}
