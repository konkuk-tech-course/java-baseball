package baseball.util;// @ author ninaaano

import baseball.view.InputView;
import baseball.exception.Exception;

public class Validation {

    public static int validateCheckString(String userInput) { // 문자열 입력, 3자리 확인
        try {
            Exception.checkString(userInput);
            return Integer.parseInt(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("문자입력. 다시 입력해주세요");
            return InputView.inputNumber();
        }
    }

    public static String validateCheckNumber(String userInput){ // 중복값 검사
        try {
            Exception.checkNumber(userInput);
            return userInput;
        } catch (IllegalArgumentException e) {
            System.out.println("중복값. 다시 입력해주세요");
            return String.valueOf(InputView.inputNumber());
        }
    }

    public static int validateCheckRestart(String userInput){ // 입력값이 1,2가 아닌경우
        try {
            Exception.checkRestart(userInput);
            return Integer.parseInt(userInput);
        } catch (IllegalArgumentException e) {
            System.out.println("1,2 다시 입력해주세요");
            return InputView.restart();
        }
    }
}
