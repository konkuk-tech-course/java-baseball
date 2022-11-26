package baseball.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import baseball.service.GameService;
import camp.nextstep.edu.missionutils.Randoms;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

import java.util.List;
import java.util.Map;

public class AnswerNumbersTest {
    private static AnswerNumbers answer;

    @BeforeAll
    static void beforeAll() {
        GameService gameService = GameService.getInstance();
        MockedStatic<Randoms> mock = mockStatic(Randoms.class);
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt()))
                .thenReturn(1, 2, 3);
        answer = gameService.createAnswer();
    }

    @Test
    void evaluateTest_of_Nothing() {
        List<Integer> guessNumbers = List.of(4, 5, 6);
        Map<Evaluation, Integer> evaluation = Map.of(
                Evaluation.BALL, 0,
                Evaluation.STRIKE, 0
        );
        assertThat(answer.evaluate(guessNumbers)).isEqualTo(evaluation);
    }

    @Test
    void evaluateTest_of_Three_Strikes() {
        List<Integer> guessNumbers = List.of(1, 2, 3);
        Map<Evaluation, Integer> evaluation = Map.of(
                Evaluation.BALL, 0,
                Evaluation.STRIKE, 3
        );
        assertThat(answer.evaluate(guessNumbers)).isEqualTo(evaluation);
    }

    @Test
    void evaluateTest_of_Three_Balls() {
        List<Integer> guessNumbers = List.of(3, 1, 2);
        Map<Evaluation, Integer> evaluation = Map.of(
                Evaluation.BALL, 3,
                Evaluation.STRIKE, 0
        );
        assertThat(answer.evaluate(guessNumbers)).isEqualTo(evaluation);
    }

    @Test
    void evaluateTest_of_One_Balls_One_Strikes() {
        List<Integer> guessNumbers = List.of(3, 2, 4);
        Map<Evaluation, Integer> evaluation = Map.of(
                Evaluation.BALL, 1,
                Evaluation.STRIKE, 1
        );
        assertThat(answer.evaluate(guessNumbers)).isEqualTo(evaluation);
    }
}

