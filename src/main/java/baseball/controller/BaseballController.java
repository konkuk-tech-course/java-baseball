package baseball.controller;

import baseball.domain.Baseball;
import baseball.domain.JudgementType;
import baseball.util.BaseballJudge;
import baseball.util.NumberGenerator;
import baseball.view.InputView;

public class BaseballController {

    Baseball computer;
    BaseballJudge baseballJudge;
    NumberGenerator numberGenerator;
    InputView userInput;
    Boolean endFlag;

    public BaseballController() {
        this.numberGenerator = new NumberGenerator();
        this.userInput = new InputView();
    }

    public boolean startGame() {
        initNewGame();

        while (!endFlag) {
            playRound();
        }
        endGame();
        return false;
    }

    private void endGame() {
        System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        retry();
    }

    private boolean retry() {
        int command = userInput.askRetry();
        if (command==1) {
            return startGame();
        }
        return false;
    }

    private void playRound() {
        Baseball userBaseball = userInput.askInputBaseball();
        JudgementType judgement = baseballJudge.judgement(userBaseball);
        System.out.println(judgement.toString());
        endFlag = baseballJudge.checkAnswer(judgement);
    }



    private void initNewGame() {
        System.out.println("숫자 야구 게임을 시작합니다.");
        endFlag = false;
        computer = numberGenerator.baseballGenerate();
        baseballJudge = new BaseballJudge(computer);
    }
}
