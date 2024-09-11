package nl.han.aim.oose.dea;

import java.util.Comparator;
import java.util.List;

public class StreamsFindShortestString {
    String findShortestString(List<String> input) {
        // find the shortest string and return it, if the list is empty return an empty string
        return input.stream()
                .min(Comparator.comparing(String::length))
                .orElse(null);
    }
}
