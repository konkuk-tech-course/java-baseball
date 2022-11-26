package baseball.util;

import baseball.constant.PrintMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    private final String RETRY = "1";
    private final String GAME_OVER = "2";
    private Pattern pattern = Pattern.compile("^[1-9]*$");

    public void userNumber(String userNumber) {
        Matcher matcher = pattern.matcher(userNumber);
        isNumber(matcher);
        isRightSize(userNumber);
        isDuplicated(userNumber);
    }

    private static void isDuplicated(String userNumber) {
        if (userNumber.chars().distinct().count() != userNumber.length()) {
            throw new IllegalArgumentException(PrintMessage.ERROR_DUPLICATED.getMessage());
        }
    }

    private static void isRightSize(String userNumber) {
        if (userNumber.length() != 3) {
            throw new IllegalArgumentException(PrintMessage.ERROR_SIZE.getMessage());
        }
    }

    private static void isNumber(Matcher matcher) {
        if (!matcher.find()) {
            throw new IllegalArgumentException(PrintMessage.ERROR_RANGE.getMessage());
        }
    }

    public void definition(String definition) {
        if (!definition.equals(RETRY) && !definition.equals(GAME_OVER)) {
            throw new IllegalArgumentException(PrintMessage.ERROR_DEFINITION.getMessage());
        }
    }
}
