package baseball.view;

public enum InputValidationRegex {
    EMPTY("^$"),
    NUMBER("^[0-9]+$"),
    REPLAY_OPTION("^[12]$");

    private final String regex;

    private InputValidationRegex(String regex) {
        this.regex = regex;
    }

    public String get() {
        return regex;
    }
}
