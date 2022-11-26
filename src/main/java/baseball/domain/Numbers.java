package baseball.domain;

import java.util.Collections;
import java.util.List;

public class Numbers {
    List<Integer> numbers;

    public Numbers (List<Integer> numbersInput) {
        numbers = numbersInput;
    }

    public List<Integer> getNumbers() {
        return Collections.unmodifiableList(numbers);
    }
}
