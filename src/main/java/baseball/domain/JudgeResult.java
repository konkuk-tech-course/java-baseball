package baseball.domain;

import baseball.view.OutputView;
import javax.swing.plaf.RootPaneUI;

public class JudgeResult {

    OutputView outputView = new OutputView();
    boolean check = false;
    public void judge(int strike, int ball) {
        initCheck();
        check=isNothing(strike, ball);
        check=isNoStrike(strike, ball);
        check=isNoBall(strike, ball);
        check=isNormal(strike, ball);
        if(strike==3){
            retry();
        }
    }

    private void retry() {

    }

    private void initCheck() {
        check=false;
    }

    private boolean isNormal(int strike, int ball) {
        if(!check) {
            outputView.printResult(ball + "볼 " + strike + "스트라이크 ", strike);
            return true;
        }
        return false;
    }

    private boolean isNoBall(int strike, int ball) {
        if(ball ==0 && !check){
            outputView.printResult(strike + "스트라이크 ", strike);
            return true;
        }
        return false;
    }

    private boolean isNoStrike(int strike, int ball) {
        if(strike == 0 & !check){
            outputView.printResult(ball + "볼 ", strike);
            return true;
        }
        return false;
    }

    private boolean isNothing(int strike, int ball) {
        if((strike == 0 && ball ==0) && !check){
            outputView.printResult("낫싱", strike);
            return true;
        }
        return false;
    }


}
