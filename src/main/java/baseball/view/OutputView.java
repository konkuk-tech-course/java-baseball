package baseball.view;

import baseball.constant.PrintMessage;

public class OutputView {

    public void printStart() {
        System.out.println(PrintMessage.START.getMessage());
    }

    public void printInputUser() {
        System.out.print(PrintMessage.INPUT_USER.getMessage());
    }

    public void printResult(String print, int strike) {
        System.out.println(print);
        if(strike==3){
            System.out.println(PrintMessage.THREE_STRIKE.getMessage());
        }
    }

    public void printException(String message){
        System.out.println(message);
    }

    public void printDefinition() {
        System.out.println(PrintMessage.DEFINITION.getMessage());
    }
}
