package baseball.ui;

import baseball.domain.BaseballGame;

public class OutputView {
    private final BaseballGame baseballGame;

    public OutputView(BaseballGame baseballGame) {
        this.baseballGame = baseballGame;
    }

    public static void print(String message){
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public void printBallCount() {
        println(baseballGame.getCurrentBallCount());
    }
}
