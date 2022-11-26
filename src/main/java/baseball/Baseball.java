package baseball;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Baseball {
    List<Integer> numbers;

    public Baseball(int num1, int num2, int num3) {
        List<Integer> numbers = Arrays.asList(num1, num2, num3);
        checkValidRange(numbers);
        checkDuplication(numbers);
        this.numbers = Arrays.asList(num1, num2, num3);
    }

    private void checkDuplication(List<Integer> numbers) {
        Set<Integer> numbersSet = new HashSet<>(numbers);
        if (numbersSet.size() != numbers.size()) {
            throw new IllegalArgumentException("[ERROR] 각 숫자는 1이상 9이하로 입력해주세요.");
        }
    }

    private void checkValidRange(List<Integer> numbers) {
        for (int num : numbers) {
            if (1 > num || num > 9) {
                throw new IllegalArgumentException("[ERROR] 각 숫자는 1이상 9이하로 입력해주세요.");
            }
        }
    }



}
