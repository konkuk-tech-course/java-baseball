package baseball.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BaseballGameTest {
    List<Integer> secretNumbers = List.of(1,3,5);
    BaseballGame baseballGame = new BaseballGame(secretNumbers);

    @Nested
    @DisplayName("입력된 3자리 정수에 따라 현재 ball count를 업데이트한다")
    class updateBallCount {
        @Test
        @DisplayName("0볼 0스트라이크")
        void nothing_test() {
            List<Integer> inputNumbers = List.of(2, 4, 6);
            baseballGame.updateBallCount(inputNumbers);
            assertEquals("낫싱", baseballGame.getCurrentBallCount());
        }
        @Test
        @DisplayName("1볼 1스트라이크")
        void one_ball_one_strike_test() {
            List<Integer> inputNumbers = List.of(1, 9, 3);
            baseballGame.updateBallCount(inputNumbers);
            assertEquals("1볼 1스트라이크", baseballGame.getCurrentBallCount());
        }
        @Test
        @DisplayName("2볼 1스트라이크")
        void two_ball_one_strike_test() {
            List<Integer> inputNumbers = List.of(1, 5, 3);
            baseballGame.updateBallCount(inputNumbers);
            assertEquals("2볼 1스트라이크", baseballGame.getCurrentBallCount());

        }
        @Test
        @DisplayName("0볼 3스트라이크")
        void three_strike_test() {
            List<Integer> inputNumbers = List.of(1, 3, 5);
            baseballGame.updateBallCount(inputNumbers);
            assertEquals("3스트라이크", baseballGame.getCurrentBallCount());
        }
    }
}