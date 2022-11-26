package baseball;

import baseball.domain.Baseball;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BaseballTest {

    @Test
    void 야구숫자유효성검사_기본기능() {
        assertThat(new Baseball(1,2,3).getNumbers()).hasSize(3);
    }

    @Test
    void 야구숫자유효성검사_숫자_배열() {
        assertThat(new Baseball(1,2,5).getNumbers()).contains(1,2,5);
    }

    @Test
    void 야구숫자에러처리() {
        assertThatThrownBy(() -> new Baseball(0,1,2))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("[ERROR] 각 숫자는 1이상 9이하로 입력해주세요.");
    }
}