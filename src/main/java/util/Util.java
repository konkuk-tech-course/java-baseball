package util;

import java.util.List;
import java.util.stream.Collectors;

public class Util {
    public static int convertStringToNumber(String numStr) {
        try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 서로다른 세 숫자를 입력하셔야 합니다.");
        }
    }
    public static List<Integer> convertNumberToList(int number) {
        return String.valueOf(number)
                .chars()
                .mapToObj(Character::getNumericValue)
                .collect(Collectors.toList());
    }
}
