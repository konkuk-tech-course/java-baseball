package baseball.domain;

import baseball.enums.Announcement;
import baseball.enums.GameCommand;
import baseball.enums.MachineState;
import baseball.ui.InputView;
import baseball.ui.OutputView;

import java.util.List;

public class GameMachine {
    private MachineState machineState;
    private final InputView inputView;
    private final NumberMaker numberMaker;
    private BaseballGame baseballGame;
    private OutputView outputView;

    public GameMachine() {
        this.machineState = MachineState.RUNNING;
        this.inputView = new InputView();
        this.numberMaker = new NumberMaker();
    }

    public void setUpGame() {
        List<Integer> numbers = numberMaker.makeNumbers();
        baseballGame = new BaseballGame(numbers);
        outputView = new OutputView(baseballGame);
    }
    public void play() {
        do {
            List<Integer> inputUniqueNumbers = inputView.readUniqueNumbers();
            baseballGame.updateBallCount(inputUniqueNumbers);
            outputView.printBallCount();
        } while (!baseballGame.isCleared());
        OutputView.println(Announcement.END_GAME.getMessage());
    }
    public void askRetry() {
        GameCommand gameCommand = inputView.readGameCommand();
        updateState(gameCommand);
    }

    public void updateState(GameCommand gameCommand) {
        if (gameCommand == GameCommand.RETRY) {
            machineState = MachineState.RUNNING;
            return;
        }
        if (gameCommand == GameCommand.QUIT) {
            machineState = MachineState.STOP;
        }
    }

    public boolean isRunning() {
        return machineState.isRunning();
    }

}
