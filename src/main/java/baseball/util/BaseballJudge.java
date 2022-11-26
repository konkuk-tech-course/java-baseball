package baseball.util;

import baseball.domain.Baseball;
import baseball.domain.JudgementType;

import java.util.List;

public class BaseballJudge {
    Baseball computer;

    public BaseballJudge(Baseball computer) {
        this.computer = computer;
    }

    public JudgementType judgement(Baseball user) {
        List<Integer> userNumbers = user.getNumbers();
        List<Integer> computerNumbers = computer.getNumbers();
        int ball = getBall(userNumbers, computerNumbers);
        int strike = getStrike(userNumbers, computerNumbers);
        return new JudgementType(strike, ball);
    }

    private int getStrike(List<Integer> userNumbers, List<Integer> computerNumbers) {
        int result = 0;
        for (int i =0; i<userNumbers.size(); i++) {
            if (userNumbers.get(i)==computerNumbers.get(i)) {
                result ++;
            }
        }
        return result;
    }

    private int getBall(List<Integer> userNumbers, List<Integer> computerNumbers) {
        int result = 0;
        for (int userNumber : userNumbers) {
            if (computerNumbers.contains(userNumber)) {
                result ++;
            }
        }
        return result;
    }

    public boolean checkAnswer(JudgementType judgement) {
        if (judgement.isHomerun()) {
            return true;
        }
        return false;
    }

}
