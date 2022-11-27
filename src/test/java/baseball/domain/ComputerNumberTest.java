package baseball.domain;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ComputerNumberTest {
    ComputerNumber computerNumber = new ComputerNumber();
    private final int SIZE=3;

    @Test
    @DisplayName("컴퓨터의 숫자가 제대로 랜덤에서 뽑혀나오는지")
    void getComputerNumber() {
        List<Integer> computerNumber1 = computerNumber.getComputerNumber();
        Assertions.assertThat(computerNumber1.size()).isEqualTo(SIZE);
    }
}