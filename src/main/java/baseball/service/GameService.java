package baseball.service;

import baseball.domain.AnswerNumbers;
import baseball.domain.BaseballNumbers;
import baseball.domain.NumbersProperties;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class GameService {
    private static GameService instance = new GameService();

    private GameService() {}

    public static GameService getInstance() {
        return instance;
    }

    public AnswerNumbers createAnswer() {
        return new AnswerNumbers(generateUniqueNumbers());
    }

    private List<Integer> generateUniqueNumbers() {
        Set<Integer> numberSet = new HashSet<>();
        while (numberSet.size() < NumbersProperties.SIZE.get()) {
            numberSet.add(generateNumber());
        }
        return new ArrayList<>(numberSet);
    }

    private int generateNumber() {
        return Randoms.pickNumberInRange(
                NumbersProperties.MIN_NUMBER.get(),
                NumbersProperties.MAX_NUMBER.get()
        );
    }
}
