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

//+package com.kodilla.stream;
//        +
//        +import com.kodilla.stream.beautifier.PoemBeautifier;
//        +import com.kodilla.stream.lambda.ExpressionExecutor;
//        +import com.kodilla.stream.reference.FunctionalCalculator;
//        +
//        +public class StreamMain {
//+    public static void main(String[] args) {
//        +        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
//        +
//                +        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
//        +        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
//        +        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
//        +        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
//        +
//                +        System.out.println("Calculating expressions with method references");
//        +        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
//        +        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
//        +        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
//        +        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
//        +
//                +        PoemBeautifier poemBeautifier = new PoemBeautifier();
//        +
//                +        poemBeautifier.beautify("brzydki tekst", (text)->"juz nie " + text);
//        +
//                +        poemBeautifier.beautify("tekst", (text)->text.toUpperCase());
//        +
//                +        poemBeautifier.beautify("tekst", (text)->text.substring(2));
//        +
//                +        poemBeautifier.beautify("tekst", (text)->text.replace("t","r"));
//        +        }
//+
//        +    }