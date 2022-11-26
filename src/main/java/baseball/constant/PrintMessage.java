package baseball.constant;

public enum PrintMessage {


    START("숫자 야구 게임을 시작합니다."),
    INPUT_USER("숫자를 입력해주세요 : "),
    BALL("볼 "),
    STRIKE("스트라이크 "),
    NOTHING("낫싱"),
    THREE_STRIKE("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    DEFINITION("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    ERROR_DUPLICATED("[ERROR] 입력값에는 중복하는 값이 존재할 수 없습니다."),
    ERROR_SIZE("[ERROR] 입력값의 길이는 3이어야 합니다."),
    ERROR_RANGE("[ERROR] 입력값으로 1-9사이의 숫자만 올 수 있습니다."),
    ERROR_DEFINITION("[ERROR] 게임 재시작은 1, 종료는 2의 숫자로만 입력 받을 수 있습니다.");


    private String message;

    PrintMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }


}
