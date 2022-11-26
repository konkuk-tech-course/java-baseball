package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.JudgementType;
import baseball.util.BaseballJudge;
import baseball.util.NumberGenerator;
import baseball.view.InputView;

public class BaseballController {

    Baseball computer;
    BaseballJudge baseballJudge;
    NumberGenerator numberGenerator;
    InputView userInput;
    Boolean endFlag;

    public BaseballController() {
        this.numberGenerator = new NumberGenerator();
        this.userInput = new InputView();
    }

    public boolean startGame() {
        initNewGame();

        while (!endFlag) {
            playRound();
        }
        endGame();
        return false;
    }
    }
}
