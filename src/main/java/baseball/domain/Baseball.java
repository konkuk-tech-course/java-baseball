package baseball.domain;

import baseball.view.Error;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baseball {
    private List<Integer> numbers;
    private final int NUMBERS_SIZE = 3;

    public Baseball(List<Integer> numbers) {
        checkSize(numbers);
        checkValidRange(numbers);
        checkDuplication(numbers);
        this.numbers = numbers;
    }

    public Baseball(int num1, int num2, int num3) {
        List<Integer> numbers = Arrays.asList(num1, num2, num3);
        checkSize(numbers);
        checkValidRange(numbers);
        checkDuplication(numbers);
        this.numbers = numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    private void checkSize(List<Integer> numbers) {
        if (numbers.size() != NUMBERS_SIZE) {
            throw new IllegalArgumentException(Error.NUMBER_SIZE_EXCEPTION.toString());
        }
    }

    private void checkDuplication(List<Integer> numbers) {
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalArgumentException(Error.NUMBER_DUPLICATION_EXCEPTION.toString());
        }
    }

    private void checkValidRange(List<Integer> numbers) {
        for (int num : numbers) {
            if (1 > num || num > 9) {
                throw new IllegalArgumentException(Error.NUMBER_RANGE_EXCEPTION.toString());
            }
        }
    }



}
