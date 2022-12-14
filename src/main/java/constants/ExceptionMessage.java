package constants;

public enum ExceptionMessage {
    NOT_VALID_NUM_MESSAGE("[ERROR] 서로 다른 세 자리 수를 입력해 주세요"),

    DUPLICATE_INPUT_MESSAGE("[ERROR] 중복된 문자를 입력하셨습니다"),
    WRONG_CODE_MESSAGE("[ERROR] 1과 2 중 하나의 수를 입력해 주세요");

    private final String message;

    ExceptionMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
