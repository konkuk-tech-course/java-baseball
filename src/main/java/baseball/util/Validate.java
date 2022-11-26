package baseball.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    Pattern pattern = Pattern.compile("^[1-9]*$");
    Convert convert = new Convert();
    public void userNumber(String userNumber) {
        Matcher matcher = pattern.matcher(userNumber);
        isNumber(matcher);
        isRightSize(userNumber);
        isDuplicated(userNumber);
    }

    private static void isDuplicated(String userNumber) {
        if(userNumber.chars().distinct().count() != userNumber.length()){
            throw new IllegalArgumentException("[ERROR] 입력값에는 중복하는 값이 존재할 수 없습니다.");
        }
    }

    private static void isRightSize(String userNumber) {
        if(userNumber.length()!=3){
            throw new IllegalArgumentException("[ERROR] 입력값의 길이는 3이어야 합니다.");
        }
    }

    private static void isNumber(Matcher matcher) {
        if(!matcher.find()){
            throw new IllegalArgumentException("[ERROR] 입력값으로 1-9사이의 숫자만 올 수 있습니다.");
        }
    }

    public void definition(String definition) {
        if(!definition.equals("1") && !definition.equals("2")){
            throw new IllegalArgumentException("[ERROR] 게임 재시작은 1, 종료는 2의 숫자로만 입력 받을 수 있습니다.");
        }
    }
}
