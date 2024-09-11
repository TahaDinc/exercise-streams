package nl.han.aim.oose.dea;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterList {

    List<String> filterStringsShorterThanThreeCharacters(List<String> input) {
        input = input.stream()
                .filter(s -> s.length() < 3)
                .collect(Collectors.toList());
        System.out.println(input);
        return input;
    }

    List<String> filterStringsThatContainOnlyNumerals(List<String> input) {
        // filter strings that contain only numerals
        input = input.stream()
                .filter(s -> s.matches("[0-9]+"))
                .collect(Collectors.toList());
        return input;
    }
}
