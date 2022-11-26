package baseball.view;

public enum InputPhrase {
    NUMBERS_INPUT("숫자를 입력해주세요 : "),
    REPLAY("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");

    private final String phrase;

    private InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}
