package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String text, PoemDecorator wyrazenieUpiekszajce) {
    String result = wyrazenieUpiekszajce.decorate(text);
    System.out.println("upiekszono: " + result);
    }
}
