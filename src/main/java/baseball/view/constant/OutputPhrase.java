package baseball.view.constant;

public enum OutputPhrase {
    START_GAME("숫자 야구 게임을 시작합니다.");

    private final String phrase;

    private OutputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}
