package baseball.domain;

import java.util.*;
import java.util.stream.IntStream;

public class AnswerNumbers extends BaseballNumbers {
    public AnswerNumbers(List<Integer> input) {
        super(input);
    }

    public Map<Evaluation, Integer> evaluate(List<Integer> guessNumbers) {
        return Map.of(
                Evaluation.BALL, calculateBall(guessNumbers),
                Evaluation.STRIKE, calculateStrike(guessNumbers));
    }

    private int calculateBall(List<Integer> guessNumbers) {
        int commonNumbersCount = (int) guessNumbers.stream()
                .filter(this.getNumbers()::contains)
                .count();
        return commonNumbersCount - calculateStrike(guessNumbers);
    }

    private int calculateStrike(List<Integer> guessNumbers) {
        return (int) IntStream.range(0, NumbersProperties.SIZE.get())
                .filter(i -> Objects.equals(this.getNumbers().get(i), guessNumbers.get(i)))
                .count();
    }
}
