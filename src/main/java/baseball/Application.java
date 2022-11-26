package baseball;

import baseball.controller.GameController;
import baseball.domain.AnswerNumbers;

public class Application {
    public static void main(String[] args) {
        GameController gameController = GameController.getInstance();
        boolean isGamePlayed = true;
        while(isGamePlayed) {
            AnswerNumbers answer = gameController.initGame();
            gameController.operate(answer);
            isGamePlayed = gameController.finishGame();
        }
    }
}
