package controller;

import constants.Status;
import domain.Computer;
import util.Validator;
import view.InputView;
import view.OutputView;

import java.util.Map;

import static constants.Code.RESTART;

public class BaseBallGameController {

    public static final int MAX_STRIKE = 3;
    private final InputView inputView;
    private final OutputView outputView;

    public BaseBallGameController() {
        Validator validator = new Validator();
        this.inputView = new InputView(validator);
        this.outputView = new OutputView();
    }

    public void playTheGame() {
        outputView.printStartMessage();
        do {
            Computer resetedComputer = new Computer();
            matchingResultWithComputer(resetedComputer);
        } while (inputView.readStartOrEndCode() == RESTART.getCode());
    }

    private void matchingResultWithComputer(Computer computer) {
        while (true) {
            int numbers = inputView.readThreeDifferentNumber();
            Map<Status, Integer> resultMap = computer.generateResultMessage(numbers);
            outputView.printGameMessage(resultMap);
            if (resultMap.get(Status.STRIKE) == MAX_STRIKE) {
                break;
            }
        }
    }
}
