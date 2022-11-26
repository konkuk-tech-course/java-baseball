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

    public void updateBallCount(List<Integer> inputUniqueNumbers) {
        currentBallCount = referee.callBallCount(secretNumbers, inputUniqueNumbers);
        if (isThreeStrike()) {
            gameState = GameState.CLEAR;
        }
    }
    private boolean isThreeStrike() {
        if (currentBallCount.containsKey(BallCount.STRIKE)) {
            return currentBallCount.get(BallCount.STRIKE) == 3;
        }
        return false;
    }

    public String getCurrentBallCount() {
        StringBuilder ballCount = new StringBuilder();
        if (!currentBallCount.containsKey(BallCount.BALL) && !currentBallCount.containsKey(BallCount.STRIKE)) {
            ballCount.append(BallCount.NOTHING.getKorean());
            return ballCount.toString();
        }
        appendCountOfBall(ballCount);
        appendCountOfStrike(ballCount);
        return ballCount.toString();
    }
    private void appendCountOfBall(StringBuilder ballCount) {
        if (currentBallCount.containsKey(BallCount.BALL)) {
            int number = currentBallCount.get(BallCount.BALL);
            ballCount.append(number).append(BallCount.BALL.getKorean()).append(" ");
        }
    }
    private void appendCountOfStrike(StringBuilder ballCount) {
        if (currentBallCount.containsKey(BallCount.STRIKE)) {
            int number = currentBallCount.get(BallCount.STRIKE);
            ballCount.append(number).append(BallCount.STRIKE.getKorean());
        }
    }

}
