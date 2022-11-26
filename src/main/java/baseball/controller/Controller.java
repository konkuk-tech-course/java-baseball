package baseball.controller;

import baseball.domain.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {

    InputView inputView;
    OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void run() {
        outputView.printStart();
        Game game = new Game(inputView, outputView);
        game.start();

    }
}
