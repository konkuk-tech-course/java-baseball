package baseball.constant;

import baseball.domain.NumbersProperties;

public enum ErrorMessage {
    INVALID_SIZE("숫자의 개수가 " + NumbersProperties.SIZE.get() + "이어야 합니다."),
    INVALID_RANGE(NumbersProperties.MIN_NUMBER.get() + "부터 " +
            NumbersProperties.MAX_NUMBER.get() + "까지의 숫자만 허용됩니다."),
    DUPLICATED_NUMBER("중복이 없도록 입력해주세요.");

    private static final String error = "[ERROR] ";
    private final String message;

    private ErrorMessage (String message) {
        this.message = message;
    }

    public String get() {
        return error + message;
    }
}
