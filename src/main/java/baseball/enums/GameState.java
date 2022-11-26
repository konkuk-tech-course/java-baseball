package baseball.enums;

public enum GameState {
    CLEAR("게임 클리어"),
    NOT_CLEAR("게임 진행중"),
    ;

    GameState(String status) {
        this.status = status;
    }

    private String status;

    public boolean isCleared() {
        return this == CLEAR;
    }

}
