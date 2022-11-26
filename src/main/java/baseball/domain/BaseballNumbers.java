package baseball.domain;

import baseball.constant.ErrorMessage;

import java.util.Collections;
import java.util.List;

public class BaseballNumbers {
    private List<Integer> numbers;

    public BaseballNumbers(List<Integer> input) {
        validate(input);
        numbers = input;
    }

    private void validate (List<Integer> input) {
        if (isInvalidSize(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_SIZE.get());
        }

        if (hasInvalidRangeNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RANGE.get());
        }

        if (hasSameNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.DUPLICATED_NUMBER.get());
        }
    }

    private boolean isInvalidSize(List<Integer> input) {
        return input.size() != NumbersProperties.SIZE.get();
    }

    private boolean hasInvalidRangeNumber(List<Integer> input) {
        return input.stream().anyMatch(this::isInvalidRange);
    }

    private boolean isInvalidRange(int number) {
        return number < NumbersProperties.MIN_NUMBER.get()
                || number > NumbersProperties.MAX_NUMBER.get();
    }

    private boolean hasSameNumber(List<Integer> input) {
        return input.stream().distinct().count() != NumbersProperties.SIZE.get();
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
