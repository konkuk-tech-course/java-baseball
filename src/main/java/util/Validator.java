package util;

import static constants.Code.QUIT;
import static constants.Code.RESTART;
import static constants.ExceptionMessage.*;

public class Validator {

    public static final int INPUT_SIZE = 3;

    public void validateNumber(int number) {
        validateNumberLength(number);
        validateDuplicateNumber(number);
    }
    private void validateNumberLength(int number) {
        int numberLength = getNumberLength(number);
        if (numberLength != INPUT_SIZE) {
            throw new IllegalArgumentException(NOT_VALID_NUM_MESSAGE.getMessage());
        }
    }

    private int getNumberLength(int number) {
        return (int) (Math.log10(number) + 1);
    }

    private void validateDuplicateNumber(int number) {
        if (hasDuplicateNum(number)) {
            throw new IllegalArgumentException(DUPLICATE_INPUT_MESSAGE.getMessage());
        }
    }

    private boolean hasDuplicateNum(int number) {
        return getDistinctDuplicateNum(number) != getNumberLength(number);
    }

    private int getDistinctDuplicateNum(int number) {
        return (int) String.valueOf(number).chars().distinct().count();
    }

    public void validateCode(int code) {
        validateLegitCode(code);
    }

    private void validateLegitCode(int code) {
        if (isValidCode(code)) {
            throw new IllegalArgumentException(WRONG_CODE_MESSAGE.getMessage());
        }
    }

    private boolean isValidCode(int code) {
        return code != RESTART.getCode() && code != QUIT.getCode();
    }
}
