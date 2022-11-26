package baseball.domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;

import java.util.List;

public class BaseballNumbersTest {
    @Test
    void When_createNumbersWithInvalidSize_Expect_IllegalArgumentException() {
        List<Integer> input = List.of(1, 2, 3, 4);
        assertThatThrownBy(() -> new BaseballNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("숫자의 개수가 3");
    }

    @Test
    void When_createNumbersWithInvalidRange_Expect_IllegalArgumentException() {
        List<Integer> input = List.of(1, 2, 0);
        assertThatThrownBy(() -> new BaseballNumbers(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("1부터 9");
    }
}
