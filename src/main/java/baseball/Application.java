package baseball;

import baseball.domain.GameMachine;
import baseball.enums.Announcement;
import baseball.ui.OutputView;

public class Application {
    public static void main(String[] args) {

        GameMachine gameMachine = new GameMachine();

        OutputView.println(Announcement.START_GAME.getMessage());
        while (gameMachine.isRunning()) {
            gameMachine.setUpGame();
            gameMachine.play();
            gameMachine.askRetry();
        }

    }
}
