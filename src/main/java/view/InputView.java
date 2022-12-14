package view;

import camp.nextstep.edu.missionutils.Console;
import util.Util;
import util.Validator;

public class InputView {

    private final Validator validator;

    public InputView(Validator validator) {
        this.validator = validator;
    }

    public void readThreeDifferentNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        int number = Util.convertStringToNumber(Console.readLine());
        validator.validateNumber(number);
    }

    public static void main(String[] args) {
        Validator validator = new Validator();
        InputView inputView = new InputView(validator);
        inputView.readThreeDifferentNumber();
    }

}
