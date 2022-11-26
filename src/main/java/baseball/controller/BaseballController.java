package baseball.controller;

import baseball.domain.Baseball;
import baseball.util.NumberGenerator;
import baseball.view.UserInput;

public class BaseballController {

    NumberGenerator numberGenerator;
    UserInput userInput;

    public BaseballController() {
        this.numberGenerator = new NumberGenerator();
        this.userInput = new UserInput();
        // TODO document why this constructor is empty
    }

    public void startGame() {
        System.out.printf("숫자 야구 게임을 시작합니다.\n");
        Baseball baseball = userInput.askInputBaseball();

    }
}
