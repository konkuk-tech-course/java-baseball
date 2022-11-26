package baseball.util;

import baseball.domain.Baseball;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class NumberGeneratorTest {

    @Test
    void numberGenerate테스트() {
        NumberGenerator numberGenerator = new NumberGenerator();
        Baseball baseball = numberGenerator.numberGenerate();
        System.out.printf(baseball.getNumbers().toString());

        assertThat(baseball.getNumbers()).hasSize(3);
    }
}