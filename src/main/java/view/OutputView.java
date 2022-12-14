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
}
