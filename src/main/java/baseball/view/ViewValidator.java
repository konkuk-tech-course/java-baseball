package baseball.view;

import baseball.constant.ErrorMessage;

import java.util.regex.Pattern;

public class ViewValidator {
    public static void validateNumbersInput(String input) {
        if (isEmpty(input)) {
            throw new IllegalArgumentException(ErrorMessage.EMPTY.get());
        }

        if (!hasOnlyNumbers(input)) {
            throw new IllegalArgumentException(ErrorMessage.NOT_NUMBER.get());
        }
    }

    private static boolean isEmpty(String input) {
        return Pattern.matches(
                InputValidationRegex.EMPTY.get(),
                input
        );
    }

    private static boolean hasOnlyNumbers(String input) {
        return Pattern.matches(
                InputValidationRegex.NUMBER.get(),
                input
        );
    }
}
