package constants;

public enum Code {
    RESTART(1),
    QUIT(2);

    private final int code;

    Code(final int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
