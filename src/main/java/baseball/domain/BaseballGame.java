package baseball.domain;

import baseball.enums.BallCount;
import baseball.enums.GameState;

import java.util.List;
import java.util.Map;

public class BaseballGame {
    private GameState gameState;
    private final List<Integer> secretNumbers;
    private Map<BallCount, Integer> currentBallCount;
    private final Referee referee;

    public BaseballGame(List<Integer> secretNumbers) {
        this.gameState = GameState.NOT_CLEAR;
        this.secretNumbers = secretNumbers;
        this.referee = new Referee();
    }

    public boolean isCleared() {
        return gameState.isCleared();
    }

}
