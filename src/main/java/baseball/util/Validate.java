package baseball.util;

import baseball.constant.PrintMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private final String RETRY = "1";
    private final String GAME_OVER = "2";
    private static final int SIZE=3;
    private Pattern pattern = Pattern.compile("^[1-9]*$");


    public void userNumber(String userNumber) {
        Matcher matcher = pattern.matcher(userNumber);
        validateNumber(matcher);
        validateSize(userNumber);
        validateDuplicate(userNumber);
    }

    private static void validateDuplicate(String userNumber) {
        if (userNumber.chars().distinct().count() != userNumber.length()) {
            throw new IllegalArgumentException(PrintMessage.ERROR_DUPLICATED.getMessage());
        }
    }

    private static void validateSize(String userNumber) {
        if (userNumber.length() != SIZE) {
            throw new IllegalArgumentException(PrintMessage.ERROR_SIZE.getMessage());
        }
    }

    private static void validateNumber(Matcher matcher) {
        if (!matcher.find()) {
            throw new IllegalArgumentException(PrintMessage.ERROR_RANGE.getMessage());
        }
    }

    public void destination(String destination) {
        if (!destination.equals(RETRY) && !destination.equals(GAME_OVER)) {
            throw new IllegalArgumentException(PrintMessage.ERROR_DEFINITION.getMessage());
        }
    }
}
