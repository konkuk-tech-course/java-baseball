package baseball.domain;

import baseball.view.InputView;
import baseball.view.OutputView;
import java.util.List;
import java.util.stream.Stream;

public class Game {

    static InputView inputView;
    static OutputView outputView;
    static JudgeResult judgeResult =new JudgeResult();
    static int strike;
    static int ball;
    static int total;
    public Game(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView= outputView;
    }

    public static void start() {
        ComputerNumber computerNumber = new ComputerNumber();
        while(true){
            List<Integer> computerNumbers = computerNumber.getComputerNumber();
            List<Integer> userNumbers = inputView.inputUserNumber();
            compareNumbers(computerNumbers, userNumbers);
            judgeResult.judge(strike,ball);

        }

    }

    private static void compareNumbers(List<Integer> computerNumbers, List<Integer> userNumbers) {
        init();
        strike = (int) Stream.iterate(0, i -> i + 1).limit(computerNumbers.size())
            .filter(index -> computerNumbers.get(index) == userNumbers.get(index)).count();
        total = (int) Stream.iterate(0, i-> i+1).limit(computerNumbers.size()).filter(index -> computerNumbers.contains(userNumbers.get(index))).count();
        ball=total-strike;
    }

    private static void init() {
        int total=0;
        int strike=0;
        int ball=0;
    }


}
