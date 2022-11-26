package baseball.view;

import baseball.constant.PrintMessage;

public class OutputView {

    private final int THREE_STRIKE=3;
    public void printStart() {
        System.out.println(PrintMessage.START.getMessage());
    }

    public void printInputUser() {
        System.out.print(PrintMessage.INPUT_USER.getMessage());
    }

    public void printResult(String print, int strike) {
        System.out.println(print);
        if(strike==THREE_STRIKE){
            System.out.println(PrintMessage.THREE_STRIKE.getMessage());
        }
    }

    public void printDefinition() {
        System.out.println(PrintMessage.DEFINITION.getMessage());
    }
}
