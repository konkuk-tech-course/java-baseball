package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberMaker {
    public List<Integer> makeNumbers() {
        List<Integer> secretNumbers = new ArrayList<>();
        while (secretNumbers.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!secretNumbers.contains(randomNumber)) {
                secretNumbers.add(randomNumber);
            }
        }
        return secretNumbers;
    }

}
