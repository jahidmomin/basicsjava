package com.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamDemoReduce {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("Jahid", "hjaks", "asd", "adsdad", "adsd");
        Optional<String> longestString = words.stream()
                .reduce((word1, word2) -> word1.length() < word2.length() ? word1 : word2);
        System.err.println(longestString.get());

        List<String> letters = Arrays.asList("a", "b", "c", "d", "e");

        String result = letters.stream().reduce("/",
                (partialString, element) -> partialString.toUpperCase() + element.toUpperCase());
        System.err.println(result);
    }
}
