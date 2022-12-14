package util;

import static constants.Code.QUIT;
import static constants.Code.RESTART;

public class Validator {

    public static final int INPUT_SIZE = 3;

    public void validateNumber(int number) {
        validateNumberLength(number);
        validateDuplicateNumber(number);
    }
    private void validateNumberLength(int number) {
        int numberLength = getNumberLength(number);
        if (numberLength != INPUT_SIZE) {
            throw new IllegalArgumentException("[ERROR] 서로 다른 세 자리 수를 입력해 주세요");
        }
    }

    private int getNumberLength(int number) {
        return (int) (Math.log10(number) + 1);
    }

    private void validateDuplicateNumber(int number) {
        if (hasDuplicateNum(number)) {
            throw new IllegalArgumentException("[ERROR] 중복된 문자를 입력하셨습니다");
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

    private static void validateLegitCode(int code) {
        if (code != RESTART.getCode() && code != QUIT.getCode()) {
            throw new IllegalArgumentException("[ERROR] 1과 2 중 하나의 수를 입력해 주세요");
        }
    }
}
