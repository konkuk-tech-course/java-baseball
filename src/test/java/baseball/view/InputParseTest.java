package baseball.view;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import java.util.List;

public class InputParseTest {
    @Test
    void When_parseNumbersInput_Expect_returnListOfNumbers() {
        assertThat(InputParser.parseNumberInput("123"))
                .isEqualTo(List.of(1, 2, 3));
    }
}
