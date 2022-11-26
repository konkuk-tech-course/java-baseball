package baseball.view;

public enum InputPhrase {
    NUMBERS_INPUT("숫자를 입력해주세요 : ");

    private final String phrase;

    private InputPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String get() {
        return phrase;
    }
}
