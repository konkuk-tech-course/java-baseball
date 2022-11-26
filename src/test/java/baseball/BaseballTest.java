package baseball;

import baseball.domain.Baseball;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BaseballTest {

    @Test
    void 야구숫자유효성검사_기본기능() {
        Baseball baseball = new Baseball(1,2,3);
        assertThat(new Baseball(1,2,3).getNumbers()).hasSize(3);
    }

    @Test
    void 야구숫자유효성검사_숫자_배열() {
        Baseball baseball = new Baseball(1,2,3);
        assertThat(new Baseball(1,2,5).getNumbers()).contains(1,2,5);
    }


}