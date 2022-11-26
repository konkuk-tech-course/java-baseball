package baseball.service;

import static org.assertj.core.api.Assertions.assertThat;

import baseball.domain.AnswerNumbers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class GameServiceTest {
    private static final GameService gameService = GameService.getInstance();
    private static AnswerNumbers answer;

    @BeforeEach
    void beforeEach() {
        answer = gameService.createAnswer();
    }

    @Test
    void When_createAnswer_Expect_hasUniqueThreeNumbers() {
        Set<Integer> answerNumberSet = new HashSet<>(answer.getNumbers());
        assertThat(answerNumberSet).hasSize(3);
    }
}
