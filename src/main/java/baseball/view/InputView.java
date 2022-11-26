package baseball.view;

import baseball.service.GameService;

public class InputView {
    private static InputView instance = new InputView();

    private InputView() {}

    public static InputView getInstance() {
        return instance;
    }


}
