package baseball.util;

import java.util.List;
import java.util.stream.Collectors;

public class Convert {


    public List<Integer> convertStringToInteger(String userNumber) {
        List<Integer> userNumbers = userNumber.chars().boxed()
            .map(user -> Character.getNumericValue(user)).collect(Collectors.toList());
        return userNumbers;
    }
}
