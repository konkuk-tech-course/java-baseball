package baseball.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {

    Pattern pattern = Pattern.compile("^[1-9]*$");
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
}
