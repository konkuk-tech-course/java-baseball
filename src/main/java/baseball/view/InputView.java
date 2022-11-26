package baseball.view;

import baseball.domain.Baseball;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class UserInput {
    private final String INT_PATTERN = "^[0-9]+$";
    private final String COMMAND_PATTERN = "^[1-2]$";
    private final String ASK_INPUT_NUMBERS = "숫자를 입력해주세요 : ";
    private final String ASK_RETRY = "게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.";

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
        if (!Pattern.matches(INT_PATTERN, inputStr)) {
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

    public int askRetry() {
        System.out.println(ASK_RETRY);
        return readRetry();
    }

    private int readRetry() {
        String inputStr = readLine();
        try {
            vaildCommand(inputStr);
            return Integer.parseInt(inputStr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return askRetry();
        }
    }

    private void vaildCommand(String inputStr) {
        if (!Pattern.matches(COMMAND_PATTERN, inputStr)) {
            throw new IllegalArgumentException("[ERROR] 올바른 명령어를 입력해주세요.");
        }
    }
}
