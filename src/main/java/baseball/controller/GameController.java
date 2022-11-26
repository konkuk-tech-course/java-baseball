package baseball.controller;

import baseball.domain.AnswerNumbers;
import baseball.domain.BaseballNumbers;
import baseball.domain.Evaluation;
import baseball.service.GameService;
import baseball.view.InputView;
import baseball.view.OutputView;
import baseball.view.constant.ReplayOptions;

import java.util.List;
import java.util.Map;

public class GameController {
    private static GameController instance = new GameController();
    private static GameService gameService = GameService.getInstance();
    private static InputView inputView = InputView.getInstance();
    private static OutputView outputView = OutputView.getInstance();
    private static final int INIT_VALUE = -1;

    private GameController() {}

    public static GameController getInstance() {
        return instance;
    }

    public AnswerNumbers initGame() {
        outputView.printGameStartPhrase();
        AnswerNumbers answer = gameService.createAnswer();
        return answer;
    }

    public void operate(AnswerNumbers answer) {
        Map<Evaluation, Integer> evaluation = Map.of(
                Evaluation.BALL, INIT_VALUE,
                Evaluation.STRIKE, INIT_VALUE
        );
        while (!gameService.isGameCleared(evaluation)) {
            evaluation = tryGuess(answer);
        }
    }

    public Map<Evaluation, Integer> tryGuess(AnswerNumbers answer) {
        BaseballNumbers guessNumbers = gameService.createGuessNumbers(inputView.readNumbersInput());
        Map<Evaluation, Integer> evaluation = answer.evaluate(guessNumbers.getNumbers());
        outputView.printEvaluation(evaluation);
        return evaluation;
    }

    public boolean finishGame() {
        int replayOption = inputView.readReplayOption();
        return replayOption == ReplayOptions.REPLAY.get();
    }

}
