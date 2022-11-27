package baseball.util;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ConvertTest {

    Convert convert = new Convert();
    private final int SIZE=3;

    @ParameterizedTest
    @ValueSource(strings = {"123", "456", "987"})
    @DisplayName("사용자 숫자의 값에 대해서 제대로 반환을 하는지")
    void convertUserNumber(String userNumber) {
        List<Integer> integers = convert.convertUserNumber(userNumber);
        Assertions.assertThat(integers.size()).isEqualTo(SIZE);
    }

    @ParameterizedTest
    @ValueSource(strings = {"1", "2"})
    @DisplayName("게임 재시작 종료에 따라 제대로 변환하는지")
    void convertDefinition(String definition){
        boolean right=true;
        int definitionNumber=0;
        try{
            definitionNumber = Integer.parseInt(definition);
        }catch (Exception e){
            right=false;
        }
        Assertions.assertThat(right).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "b"})
    @DisplayName("(예외)게임 재시작 종료에 따라 제대로 반환을 못 할 경우")
    void convertDefinitionWrong(String definition){
        boolean right=true;
        int definitionNumber=0;
        try{
            definitionNumber = Integer.parseInt(definition);
        }catch (Exception e){
            right=false;
        }
        Assertions.assertThat(right).isFalse();
    }
}