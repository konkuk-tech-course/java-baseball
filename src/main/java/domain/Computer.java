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

    public Map<Status, Integer> generateResultMessage(int number) {
        List<Integer> userList = Util.convertNumberToList(number);
        int containedNumber = getContainedCount(number);
        // contain 개수 - strike 개수 = ball 개수
        int strikeCount = calculateStrikeCount(userList);
        int ballCount = containedNumber - strikeCount;
        setResult(strikeCount, ballCount);
        return map;
    }

    private int getContainedCount(int number) {
        return (int) String.valueOf(number)
                .chars()
                .mapToObj(Character::getNumericValue)
                .filter(generatedNumber::contains).count();
    }

    private int calculateStrikeCount(List<Integer> userList) {
        int strikeCount = 0;
        for (int i = 0; i < NUM_LENGTH; i++) {
            if (Objects.equals(generatedNumber.get(i), userList.get(i))) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    private void setResult(int strikeCount, int ballCount) {
        map.put(BALL, ballCount);
        map.put(STRIKE, strikeCount);
    }
}
