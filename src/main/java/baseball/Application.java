package baseball;

import controller.BaseBallGameController;

public class Application {
    public static void main(String[] args) {
        BaseBallGameController controller = new BaseBallGameController();
        controller.playTheGame();
    }
}
