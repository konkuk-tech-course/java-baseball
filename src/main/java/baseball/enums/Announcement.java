package baseball.enums;

public enum Announcement {
    START_GAME("숫자 야구 게임을 시작합니다."),
    END_GAME("3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INPUT_NUMBERS("숫자를 입력해주세요 : "),
    INPUT_NUMBERS_BY_RULE("[ERROR] 중복값이 없는 3자리의 정수를 입력해주세요."),
    INPUT_GAME_COMMAND_GUIDE("게임을 새로 시작하려면 "
                                + GameCommand.RETRY.getShortcut()
                                + ", 종료하려면 "
                                +GameCommand.QUIT.getShortcut()+ "를 입력하세요."),
    INPUT_GAME_COMMAND("[ERROR] 제시된 게임 커멘드 숫자를 입력해주세요."),
    ;
    private final String message;

    Announcement(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
