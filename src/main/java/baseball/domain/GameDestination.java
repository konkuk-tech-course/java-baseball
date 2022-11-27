package baseball.domain;

import baseball.view.InputView;

public class GameDestination {

    private static final int RETRY = 1;

    public static boolean destination(InputView inputView) {
        int destinationNumber = inputView.inputDestination();
        if (destinationNumber == RETRY) {
            return true;
        }
        return false;
    }

}
