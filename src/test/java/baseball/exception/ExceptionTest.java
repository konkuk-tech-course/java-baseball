package baseball.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static camp.nextstep.edu.missionutils.test.Assertions.assertSimpleTest;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

// @ author ninaaano
class ExceptionTest {

    @Test
    @DisplayName("문자열 입력시 예외 발생/입력값이 숫자가 아닐 시 예외 발생")
    void checkString() {
        String input = "abc";

        assertThatThrownBy(() -> input.charAt(4))
                .isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 4");
    }

    @Test
    @DisplayName("같은 숫자 입력 시 예외 발생")
    void checkNumber() {
    }

    @Test
    @DisplayName("입력값이 1,2가 아닐 시 예외 발생")
    void checkRestart() {
    }
}