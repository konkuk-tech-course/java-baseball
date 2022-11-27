package baseball.domain;

import java.util.List;
import java.util.stream.Stream;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameCoreTest {

    List<Integer> computerNumbers = List.of(1,2,3);
    List<Integer> userNumbers= List.of(2,1,3);

    @Test
    @DisplayName("스트라이크, 볼 판정을 잘 내리는지 확인하는 테스트")
    void compareNumbers(){
        int strike = (int) Stream.iterate(0, i -> i + 1).limit(computerNumbers.size())
            .filter(index -> computerNumbers.get(index) == userNumbers.get(index)).count();
        int total = (int) Stream.iterate(0, i -> i + 1).limit(computerNumbers.size())
            .filter(index -> computerNumbers.contains(userNumbers.get(index))).count();
        int ball = total - strike;
        Assertions.assertThat(strike).isEqualTo(1);
        Assertions.assertThat(total).isEqualTo(3);
        Assertions.assertThat(ball).isEqualTo(2);
    }

}
