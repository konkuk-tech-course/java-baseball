package view;

import constants.Status;

import java.util.Map;

import static constants.GameMessage.*;
import static constants.Status.BALL;
import static constants.Status.STRIKE;

public class OutputView {

    public static final int MAX_STRIKE = 3;
    private int ballCount;
    private int strikeCount;
    public void printStartMessage() {
        System.out.println(GAME_START_MESSAGE.getMessage());
    }

    public void printGameMessage(Map<Status, Integer> resultMap) {
        ballCount = resultMap.getOrDefault(BALL, 0);
        strikeCount = resultMap.getOrDefault(STRIKE, 0);
        whenNoBallNoStrike();
        whenNoStrike();
        whenBallAndStrikeExists();
        whenNoBall();
    }

    private void whenNoBall() {
        if (ballCount == 0 && strikeCount > 0) {
            System.out.println(strikeCount + STRIKE_MESSAGE.getMessage());
            whenAllMatched();
        }
    }

    private void whenAllMatched() {
        if (strikeCount == MAX_STRIKE) {
            printEndMessage();
        }
    }

    private void whenBallAndStrikeExists() {
        if (ballCount > 0 && strikeCount > 0) {
            System.out.println(ballCount + BALL_MESSAGE.getMessage() + " " + strikeCount + STRIKE_MESSAGE.getMessage());
        }
    }

    private void whenNoStrike() {
        if (ballCount > 0 && strikeCount == 0) {
            System.out.println(ballCount + BALL_MESSAGE.getMessage());
        }
    }

    private void whenNoBallNoStrike() {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println(NOTING_MESSAGE.getMessage());
        }
    }

    private void printEndMessage() {
        System.out.println(GAME_END_MESSAGE.getMessage());
    }
}
