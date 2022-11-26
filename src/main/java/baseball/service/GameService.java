package baseball.service;

import baseball.domain.AnswerNumbers;
import baseball.domain.BaseballNumbers;
import baseball.domain.Evaluation;
import baseball.domain.NumbersProperties;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.*;

public class GameService {
    private static GameService instance = new GameService();
    private static final int NOTHING = 0;

    private GameService() {}

    public static GameService getInstance() {
        return instance;
    }

    public BaseballNumbers createGuessNumbers(List<Integer> guessNumbersInput) {
        return new BaseballNumbers(guessNumbersInput);
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

    public boolean isGameCleared(Map<Evaluation, Integer> evaluation) {
        return evaluation.get(Evaluation.BALL) == NOTHING
                && evaluation.get(Evaluation.STRIKE) == NumbersProperties.SIZE.get();
    }
}
