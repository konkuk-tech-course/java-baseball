package view;

import constants.Status;

import java.util.Map;

import static constants.Status.BALL;
import static constants.Status.STRIKE;

public class OutputView {

    public static final int MAX_STRIKE = 3;
    private int ballCount;
    private int strikeCount;
    public void printStartMessage() {
        System.out.println("숫자 야구 게임을 시작합니다.");
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
            System.out.println(strikeCount +"스트라이크");
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
            System.out.println(ballCount + "볼 " + strikeCount + "스트라이크");
        }
    }

    private void whenNoStrike() {
        if (ballCount > 0 && strikeCount == 0) {
            System.out.println(ballCount+"볼");
        }
    }

    private void whenNoBallNoStrike() {
        if (ballCount == 0 && strikeCount == 0) {
            System.out.println("낫싱");
        }
    }

    private void printEndMessage() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
    }
}
