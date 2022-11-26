package baseball.util;

import baseball.domain.Baseball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static camp.nextstep.edu.missionutils.Randoms.*;

public class NumberGenerator {

    public Baseball numberGenerate() {
        return new Baseball(getNumbers());
    }

    private List<Integer> getNumbers() {
        Set<Integer> numbers = new HashSet<>();

        while (numbers.size()<3) {
            numbers.add(pickNumberInRange(1,9));
        }

        return new ArrayList<>(numbers);
    }

}
