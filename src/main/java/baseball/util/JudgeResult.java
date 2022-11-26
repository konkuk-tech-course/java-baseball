package baseball.util;

import baseball.constant.PrintMessage;
import baseball.view.OutputView;

public class JudgeResult {

    private final int NONE = 0;
    private OutputView outputView = new OutputView();

    boolean check = false;

    public void judge(int strike, int ball) {
        initCheck();
        check = isNothing(strike, ball);
        check = isNoStrike(strike, ball);
        check = isNoBall(strike, ball);
        check = isNormal(strike, ball);
    }

    private void initCheck() {
        check = false;
    }

    private boolean isNormal(int strike, int ball) {
        if (!check) {
            outputView.printResult(
                ball + PrintMessage.BALL.getMessage() + strike + PrintMessage.STRIKE.getMessage(),
                strike);
            return true;
        }
        return check;
    }

    private boolean isNoBall(int strike, int ball) {
        if (ball == NONE && !check) {
            outputView.printResult(strike + PrintMessage.STRIKE.getMessage(), strike);
            return true;
        }
        return check;
    }

    private boolean isNoStrike(int strike, int ball) {
        if (strike == NONE & !check) {
            outputView.printResult(ball + PrintMessage.BALL.getMessage(), strike);
            return true;
        }
        return check;
    }

    private boolean isNothing(int strike, int ball) {
        if ((strike == NONE && ball == NONE) && !check) {
            outputView.printResult(PrintMessage.NOTHING.getMessage(), strike);
            return true;
        }
        return check;
    }


}
