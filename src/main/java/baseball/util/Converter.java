package baseball.util;// @ author ninaaano

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Converter {

    public static List<Integer> change(String userInput){
        return Arrays.stream(userInput.split(""))
                .map(Integer :: valueOf)
                .collect(toList());
    }

}
