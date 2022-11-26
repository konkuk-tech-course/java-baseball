package baseball.domain;

public class JudgementType {
    private int strike;
    private int ball;
    private boolean homerun;
    private final String STRIKE_MESSAGE = "%d스트라이크 ";
    private final String BALL_MESSAGE = "%d볼 ";
    private final String NOTHING_MESSAGE = "낫싱";

    public JudgementType(int strike, int ball) {
        this.strike = strike;
        this.ball = ball-strike;
        this.homerun = false;
    }

    public boolean isHomerun() {
        if(strike==3) {
            homerun = true;
        }
        return homerun;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getBall(ball));
        sb.append(getStrike(strike));
        sb.append(isNothing());

        return sb.toString().trim();
    }

    private String getBall(int ball) {
        if (ball != 0) {
            return String.format(BALL_MESSAGE, ball);
        }
        return "";
    }

    private String getStrike(int strike) {
        if (strike != 0) {
            return String.format(STRIKE_MESSAGE, strike);
        }
        return "";
    }

    private String isNothing() {
        if (ball==0 && strike==0) {
            return NOTHING_MESSAGE;
        }
        return "";
    }
}
