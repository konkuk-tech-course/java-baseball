package baseball.util;

import static org.junit.jupiter.api.Assertions.*;

import baseball.constant.PrintMessage;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ValidateTest {

    private Pattern pattern = Pattern.compile("^[1-9]*$");
    private static final String RETRY="1";
    private static final String GAME_OVER="2";

    @ParameterizedTest
    @ValueSource(strings = {"13a","rㄴ"})
    @DisplayName("사용자 숫자 입력 시 1-9사이의 숫자 입력이 아닌 경우")
    void isNumber(String userNumber) {
        boolean wrong=false;
        Matcher matcher = pattern.matcher(userNumber);
        if (!matcher.find()) {
            wrong=true;
        }
        Assertions.assertThat(wrong).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"1234","12"})
    @DisplayName("사용자 숫자 입력 작성 시 길이가 3이 아닌 경우")
    void isRightSize(String userNumber) {
        boolean wrong=false;
        if (userNumber.length() != 3) {
            wrong=true;
        }
        Assertions.assertThat(wrong).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"133","222"})
    @DisplayName("사용자 숫자 입력 작성 시 중복된 경우")
    void isDuplicated(String userNumber) {
        boolean wrong=false;
        if (userNumber.chars().distinct().count() != userNumber.length()) {
            wrong=true;
        }
        Assertions.assertThat(wrong).isTrue();
    }
    @ParameterizedTest
    @ValueSource(strings = {"a","3", "4"})
    @DisplayName("게임 재시작시 잘못된 입력 작성 시 오류")
    void definition(String definition) {
        boolean wrong=false;
        if (!definition.equals(RETRY) && !definition.equals(GAME_OVER)) {
            wrong = true;
        }
        Assertions.assertThat(wrong).isTrue();
    }

}