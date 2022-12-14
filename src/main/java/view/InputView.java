package view;

import camp.nextstep.edu.missionutils.Console;
import util.Util;
import util.Validator;

import static constants.GameMessage.CODE_INPUT_MESSAGE;
import static constants.GameMessage.NUMBER_INPUT_MESSAGE;

public class InputView {

    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public int readThreeDifferentNumber() {
        System.out.print(NUMBER_INPUT_MESSAGE.getMessage());
        int number = Util.convertStringToNumber(Console.readLine());
        validator.validateNumber(number);
        return number;
    }

    public int readStartOrEndCode() {
        System.out.println(CODE_INPUT_MESSAGE.getMessage());
        int code = Util.convertStringToNumber(Console.readLine());
        validator.validateCode(code);
        return code;
    }
}
