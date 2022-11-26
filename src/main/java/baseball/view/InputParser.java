package baseball.view;

import java.util.ArrayList;
import java.util.List;

public class InputParser {
    public static List<Integer> parseNumberInput(String numbersInput) {
        List<Integer> numbers = new ArrayList<>();
        numbersInput.chars().map(Character::getNumericValue)
                .forEach(numbers::add);
        return numbers;
    }
}
