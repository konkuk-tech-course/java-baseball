package baseball.view;

public enum Error {
    NUMBER_SIZE_EXCEPTION("3자리 숫자를 입력해주세요.\n"),
    NUMBER_DUPLICATION_EXCEPTION("중복된 숫자가 없어야 합니다.\n"),
    NUMBER_RANGE_EXCEPTION("각 숫자는 1이상 9이하로 입력해주세요.\n"),
    NUMBER_PARSE_EXCEPTION("숫자를 입력해 주세요.\n"),
    COMMAND_NOT_VAILD_EXCEPTION("올바른 명령어를 입력해주세요.\n");


    String tag = "[ERROR] ";
    String message;

    Error(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return tag + message;
    }
}
