package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsCreateFullSentence {
    String createAFullSentenceFromTheList(List<String> input) {
        // create a full sentence from the list and return it
        return input.stream()
                .collect(Collectors.joining(" "));
    }
}
