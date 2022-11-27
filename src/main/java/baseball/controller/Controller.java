package baseball.controller;

import baseball.domain.Game;
import baseball.view.InputView;
import baseball.view.OutputView;

public class Controller {

    private InputView inputView;
    private OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView=inputView;
        this.outputView=outputView;
    }

    public void run(){
        Game game = new Game();
        outputView.printStart();
        game.start();
    }
}
