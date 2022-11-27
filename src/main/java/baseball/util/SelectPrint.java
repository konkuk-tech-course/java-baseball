package baseball.util;

import baseball.constant.PrintMessage;
import baseball.view.OutputView;

public class SelectPrint {

    private final int NONE = 0;
    private OutputView outputView = new OutputView();

    boolean check = false;

    public void select(int strike, int ball) {
        initCheck();
        check = checkNothing(strike, ball);
        check = checkNoStrike(strike, ball);
        check = checkNoBall(strike, ball);
        check = checkNormal(strike, ball);
    }

    private void initCheck() {
        check = false;
    }

    private boolean checkNormal(int strike, int ball) {
        if (!check) {
            outputView.printResult(
                ball + PrintMessage.BALL.getMessage() + strike + PrintMessage.STRIKE.getMessage(),
                strike);
            return true;
        }
        return check;
    }

    private boolean checkNoBall(int strike, int ball) {
        if (ball == NONE && !check) {
            outputView.printResult(strike + PrintMessage.STRIKE.getMessage(), strike);
            return true;
        }
        return check;
    }

    private boolean checkNoStrike(int strike, int ball) {
        if (strike == NONE & !check) {
            outputView.printResult(ball + PrintMessage.BALL.getMessage(), strike);
            return true;
        }
        return check;
    }

    private boolean checkNothing(int strike, int ball) {
        if ((strike == NONE && ball == NONE) && !check) {
            outputView.printResult(PrintMessage.NOTHING.getMessage(), strike);
            return true;
        }
        return check;
    }


}
