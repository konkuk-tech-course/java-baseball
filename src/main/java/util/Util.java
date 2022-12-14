package util;

public class Util {
    public static int convertStringToNumber(String numStr) {
        try {
            return Integer.parseInt(numStr);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("[ERROR] 서로다른 세 숫자를 입력하셔야 합니다.");
        }
    }
}
