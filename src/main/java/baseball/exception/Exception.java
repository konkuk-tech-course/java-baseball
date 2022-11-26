package baseball.exception;// @ author ninaaano

import java.util.Arrays;
import java.util.List;

public class Exception {
    public static final String CHECK_STRING = "입력 값에 문자가 들어올 수 없습니다.";
    public static final String CHECK_LENGTH = "숫자는 3개만 입력할 수 있습니다.";
    public static final String CHECK_NUMBER = "같은 숫자는 입력할 수 없습니다.";
    public static final String CHECK_RESTART = "1과 2만 입력할 수 있습니다.";

    public static final int INPUT_LENGTH = 3;

    public static final String IS_NUMBER = "[0-9]*";
    public static final String num = "1,2";

    public static void checkString(String userInput) throws IllegalArgumentException {
        if (!userInput.matches(IS_NUMBER)) {
            throw new IllegalArgumentException("[ERROR]" + CHECK_STRING);
        }
        int size = Integer.parseInt(userInput);
        if (size < INPUT_LENGTH || size > INPUT_LENGTH)
            throw new IllegalArgumentException("[ERROR]" + CHECK_LENGTH);
        List<Integer> numList = Arrays.asList(size);
        if(numList.size() != numList.stream().distinct().count()){
            throw new IllegalArgumentException("[ERROR]" + CHECK_NUMBER);
        }
    }

    public static void checkNumber(String userInput) throws IllegalArgumentException {
        int result = Integer.parseInt(Arrays.toString(userInput.split("")));
        List<Integer> numList = Arrays.asList(result);
        if(numList.size() != numList.stream().distinct().count()){
            throw new IllegalArgumentException("[ERROR]" + CHECK_NUMBER);
        }
    }

    public static void checkRestart(String userInput) throws IllegalArgumentException {
        if(!userInput.matches(num)){
            throw new IllegalArgumentException("[ERROR]" + CHECK_RESTART);
        }
    }


}
