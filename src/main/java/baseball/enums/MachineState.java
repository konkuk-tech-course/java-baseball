package baseball.enums;

public enum MachineState {
    RUNNING("가동 중"),
    STOP("멈춤"),
    ;

    MachineState(String status) {
        this.status = status;
    }

    private String status;

    public boolean isRunning() {
        return this == RUNNING;
    }

}
