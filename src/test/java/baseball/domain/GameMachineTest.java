package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class GameMachineTest {
    List<Integer> secretNumbers = List.of(1,3,5);
    BaseballGame baseballGame = new BaseballGame(secretNumbers);

    @Nested
    @DisplayName("3스트라이크일때만 게임이 클리어된다")
    class play_test {
        @Test
        @DisplayName("3스트라이크이면 게임이 클리어된다")
        void clear_test() {
            List<Integer> inputNumbers = List.of(1, 3, 5);
            baseballGame.updateBallCount(inputNumbers);
            assertTrue(baseballGame.isCleared());
        }
        @Test
        @DisplayName("3스트라이크이면 게임이 클리어된다")
        void non_clear_test() {
            List<Integer> inputNumbers = List.of(2, 3, 5);
            baseballGame.updateBallCount(inputNumbers);
            assertFalse(baseballGame.isCleared());
        }
    }

}