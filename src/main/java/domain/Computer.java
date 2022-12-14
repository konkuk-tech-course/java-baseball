package domain;

import camp.nextstep.edu.missionutils.Randoms;
import constants.Status;
import util.Util;

import java.util.*;

import static constants.Status.BALL;
import static constants.Status.STRIKE;

public class Computer {

    private static final int NUM_LENGTH = 3;
    public static final int START_INCLUSIVE = 1;
    public static final int END_INCLUSIVE = 9;
    public final List<Integer> generatedNumber = new ArrayList<>();

    private final Map<Status, Integer> map = new HashMap<>();

    public Computer() {
        generateComputerNum();
    }

    private void generateComputerNum() {
        while (generatedNumber.size() < NUM_LENGTH) {
            int randomNumber = Randoms.pickNumberInRange(START_INCLUSIVE, END_INCLUSIVE);
            if (!generatedNumber.contains(randomNumber)) {
                generatedNumber.add(randomNumber);
            }
        }
    }
}
