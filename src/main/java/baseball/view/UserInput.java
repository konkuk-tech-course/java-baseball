package baseball.view;

import baseball.domain.Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UserInput {
    private final String intPattern = "^[0-9]+$";
    private final String ASK_INPUT_NUMBERS = "숫자를 입력해주세요 : ";

    public Baseball askInputBaseball() {
        int input = askNumbers();
        return getBaseball(input);
    }

    private int askNumbers() {
        System.out.print(ASK_INPUT_NUMBERS);
        return readInt();
    }

    private Baseball getBaseball(int input) {
        try {
            List<Integer> numbers = getSeparate(input);
            return new Baseball(numbers);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askInputBaseball();
        }
    }

    private int readInt() {
        String inputStr = readLine();
        try {
            vaildNumber(inputStr);
            return Integer.parseInt(inputStr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askNumbers();
        }
    }

    private void vaildNumber(String inputStr) {
        if (!Pattern.matches(intPattern, inputStr)) {
            throw new IllegalArgumentException("[ERROR] 숫자를 입력하세요.\n");
        }
    }

    private List<Integer> getSeparate(int input) {
        List<Integer> numbers = new ArrayList<>();
        while (input>0) {
            numbers.add(input%10);
            input /= 10;
        }
        return numbers;
    }
}
