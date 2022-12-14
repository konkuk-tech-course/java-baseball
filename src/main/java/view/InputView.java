package view;

import camp.nextstep.edu.missionutils.Console;
import util.Util;
import util.Validator;

public class InputView {

    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public int readThreeDifferentNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        int number = Util.convertStringToNumber(Console.readLine());
        validator.validateNumber(number);
        return number;
    }

    public int readStartOrEndCode() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        int code = Util.convertStringToNumber(Console.readLine());
        validator.validateCode(code);
        return code;
    }
}
