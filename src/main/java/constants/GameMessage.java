package constants;

public enum GameMessage {
    NUMBER_INPUT_MESSAGE("숫자를 입력해주세요 : "),
    CODE_INPUT_MESSAGE("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    GAME_START_MESSAGE("숫자 야구 게임을 시작합니다."),
    STRIKE_MESSAGE("스트라이크"),
    BALL_MESSAGE("볼"),
    NOTING_MESSAGE("낫싱"),
    GAME_END_MESSAGE("3개의 숫자를 모두 맞히셨습니다! 게임 종료");

    private final String message;

    GameMessage(final String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
