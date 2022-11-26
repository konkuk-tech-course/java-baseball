package baseball.enums;

public enum BallCount {
    STRIKE("스트라이크"),
    BALL("볼"),
    NOTHING("낫싱"),
    ;
    private String korean;

    BallCount(String korean) {
        this.korean = korean;
    }

    public String getKorean() {
        return korean;
    }

    public boolean isStrike() {
        return this == STRIKE;
    }

    public boolean isBall() {
        return this == BALL;
    }

}
