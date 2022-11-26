package baseball.view.constant;

public enum ReplayOptions {
    REPLAY(1),
    QUIT(2);

    private final int option;

    private ReplayOptions(int option) {
        this.option = option;
    }

    public int get() {
        return option;
    }
}
