package baseball.view;

import baseball.domain.Baseball;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class UserInputTest {

//    @Test
//    @ValueSource(strings = "123")
//    void askNumber테스트(String input) {
//        InputStream in = generatoteUserInput(input);
//        System.setIn(in);
//
//        UserInput userInput = new UserInput();
//        Baseball baseball = userInput.askNumbers();
//        assertThat(baseball.getNumbers()).hasSize(3);
//    }

    public static InputStream generatoteUserInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }
}