package baseball.domain;

import baseball.view.InputView;

public class GameDefinition {

    private static final int RETRY = 1;

    public static boolean judge(InputView inputView) {
        int definitionNumber = inputView.inputDefinition();
        if (definitionNumber == RETRY) {
            return true;
        }
        return false;
    }

}
