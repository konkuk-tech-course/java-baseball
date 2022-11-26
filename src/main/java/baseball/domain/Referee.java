package baseball.domain;

import baseball.enums.BallCount;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Referee {
    private Map<BallCount, Integer> record;

    public Map<BallCount, Integer> callBallCount(List<Integer> gameUniqueNumbers, List<Integer> inputUniqueNumbers) {
        eraseRecord();
        judge(gameUniqueNumbers, inputUniqueNumbers);
        return record;
    }
    private void eraseRecord() {
        record = new HashMap<>();
    }
    private void judge(List<Integer> gameUniqueNumbers, List<Integer> inputUniqueNumbers) {
        for (int index = 0; index < 3; index++) {
            int inputDigit = inputUniqueNumbers.get(index);
            if (gameUniqueNumbers.contains(inputDigit)) {
                int computerDigit = gameUniqueNumbers.get(index);
                updateBallCount(computerDigit, inputDigit);
            }
        }
    }
    private void updateBallCount(int computerDigit, int inputDigit) {
        if (computerDigit == inputDigit) {
            updateNumberOfStrike();
        } else {
            updateNumberOfBall();
        }
    }

    private void updateNumberOfStrike() {
        if (record.containsKey(BallCount.STRIKE)) {
            record.put(BallCount.STRIKE, record.get(BallCount.STRIKE) + 1);
        } else {
            record.put(BallCount.STRIKE, 1);
        }
    }
    private void updateNumberOfBall() {
        if (record.containsKey(BallCount.BALL)) {
            record.put(BallCount.BALL, record.get(BallCount.BALL) + 1);
        } else {
            record.put(BallCount.BALL, 1);
        }
    }

}
