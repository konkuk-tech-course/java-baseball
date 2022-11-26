package baseball.enums;

import java.util.Arrays;
import java.util.Optional;

public enum GameCommand {
    RETRY(1, "게임 재시도"),
    QUIT(2, "게임 종료"),
    ;
    private final int shortcut;
    private final String guide;

    GameCommand(int shortcut, String guide) {
        this.shortcut = shortcut;
        this.guide = guide;
    }

    public static GameCommand findGameCommand(int input) {
        return Arrays.stream(GameCommand.values())
                .filter(v -> v.shortcut == input)
                .findFirst().orElseThrow(() -> new IllegalArgumentException());
    }
    public static boolean contains(int input) {
        return Arrays.stream(GameCommand.values())
                .map(v -> v.getShortcut())
                .anyMatch(shortcut -> shortcut.equals(input));
    }

    public int getShortcut() {
        return shortcut;
    }
}
