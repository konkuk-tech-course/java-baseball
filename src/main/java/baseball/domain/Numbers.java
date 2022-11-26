package baseball.domain;

import baseball.constant.ErrorMessage;

import java.util.Collections;
import java.util.List;

public class Numbers {
    List<Integer> numbers;

    public Numbers (List<Integer> input) {
        numbers = input;
    }

    private void validate (List<Integer> input) {
        if (isInvalidSize(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_SIZE.get());
        }

        if (hasInvalidRangeNumber(input)) {
            throw new IllegalArgumentException(ErrorMessage.INVALID_RANGE.get());
        }
    }

    private boolean isInvalidSize (List<Integer> input) {
        return input.size() != NumbersProperties.SIZE.get();
    }

    private boolean hasInvalidRangeNumber(List<Integer> input) {
        return input.stream().map(this::isInvalidRange)
                .findAny()
                .orElse(false);
    }

    private boolean isInvalidRange (int number) {
        return number >= NumbersProperties.MIN_NUMBER.get()
                && number <= NumbersProperties.MAX_NUMBER.get();
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
