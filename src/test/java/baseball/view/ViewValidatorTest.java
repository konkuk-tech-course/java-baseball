package baseball.view;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ViewValidatorTest {
    @Test
    void When_EmptyInput_Expect_IllegalArgumentException() {
        assertThatThrownBy(() -> ViewValidator.validateNumbersInput(""))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("값을 입력하지 않았습니다.");
    }

    @ParameterizedTest(name = "{index}) input = \"{0}\"")
    @ValueSource(strings = { "a", "ㄱ", "1ㄱ" })
    void When_NonNumericInput_Expect_IllegalArgumentException(String input) {
        assertThatThrownBy(() -> ViewValidator.validateNumbersInput(input))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR]")
                .hasMessageContaining("숫자만");
    }
}
