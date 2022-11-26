package baseball.ui;

import baseball.enums.Announcement;
import baseball.enums.GameCommand;

import java.util.ArrayList;
import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    public List<Integer> readUniqueNumbers() {
        OutputView.print(Announcement.INPUT_NUMBERS.getMessage());
        String input = readLine();
        validateInteger(input);
        validateSize(input);
        List<Integer> threeNumbers = convertList(input);
        validateDuplication(threeNumbers);
        validateRange(threeNumbers);
        return threeNumbers;
    }

    private void validateSize(String input) {
        if (input.length() > 3) {
            throw new IllegalArgumentException();
        }
    }
    private List<Integer> convertList(String input) {
        List<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < input.length(); index++) {
            numbers.add(Integer.parseInt(String.valueOf(input.charAt(index))));
        }
        return numbers;
    }
    private void validateDuplication(List<Integer> input) {
        long size = input.stream().distinct().count();
        if (!(size == input.size())) {
            throw new IllegalArgumentException();
        }
    }
    private void validateInteger(String input) {
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
    private void validateRange(List<Integer> input) {
        if (!(input.stream().allMatch(v -> 1 <= v && v <= 9))) {
            throw new IllegalArgumentException();
        }
    }

}
