package baseball.view;

import baseball.service.GameService;
import camp.nextstep.edu.missionutils.Console;

import java.util.List;

public class InputView {
    private static InputView instance = new InputView();

    private InputView() {}

    public static InputView getInstance() {
        return instance;
    }

    public List<Integer> readNumbersInput() {
        System.out.print(InputPhrase.NUMBERS_INPUT.get());
        String input = Console.readLine().trim();
        ViewValidator.validateNumbersInput(input);
        return InputParser.parseNumberInput(input);
    }

    public int readReplayOption() {
        System.out.println(InputPhrase.REPLAY.get());
        String input = Console.readLine().trim();
        ViewValidator.validateReplayOptionInput(input);
        return Integer.parseInt(input);
    }
}
