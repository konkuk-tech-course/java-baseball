package baseball.domain;

import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;

public class Game {

    static InputView inputView;
    static OutputView outputView;
    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView= outputView;
    }

    public static void start() {
        ComputerNumber computerNumber = new ComputerNumber();
        while(true){
            List<Integer> computerNumbers = computerNumber.getComputerNumber();
            inputView.inputUserNumber();

        }

    }
}
