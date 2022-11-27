package baseball.domain;

import baseball.util.SelectPrint;
import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import java.util.stream.Stream;

public class Game {

    private static final int THREE_STRIKE = 3;
    private static InputView inputView;
    private static OutputView outputView;
    private static SelectPrint selectPrint = new SelectPrint();
    private static GameDestination gameDestination = new GameDestination();
    private static ComputerNumber computerNumber = new ComputerNumber();
    private static int strike;
    private static int ball;
    private static int total;



    public static void start() {
        init();
        List<Integer> computerNumbers = computerNumber.getComputerNumber();
        while (strike != THREE_STRIKE) {
            List<Integer> userNumbers = inputView.inputUserNumber();
            compareNumbers(computerNumbers, userNumbers);
            selectPrint.select(strike, ball);
        }
        retry();
    }

    private static void retry() {
        if (destination()) {
            start();
        }
    }

    private static boolean destination() {
        boolean judge = false;
        if (strike == THREE_STRIKE) {
            judge = gameDestination.destination(inputView);
        }
        return judge;
    }


    private static void compareNumbers(List<Integer> computerNumbers, List<Integer> userNumbers) {
        init();
        strike = (int) Stream.iterate(0, i -> i + 1).limit(computerNumbers.size())
            .filter(index -> computerNumbers.get(index) == userNumbers.get(index)).count();
        total = (int) Stream.iterate(0, i -> i + 1).limit(computerNumbers.size())
            .filter(index -> computerNumbers.contains(userNumbers.get(index))).count();
        ball = total - strike;
    }

    private static void init() {
        total = 0;
        strike = 0;
        ball = 0;
    }


}
