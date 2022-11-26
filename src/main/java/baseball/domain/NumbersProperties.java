package baseball.domain;

public enum NumbersProperties {
    SIZE(3),
    MIN_NUMBER(1),
    MAX_NUMBER(9);

    private final int property;

    private NumbersProperties(int property) {
        this.property = property;
    }

    public int get() {
        return property;
    }
}
