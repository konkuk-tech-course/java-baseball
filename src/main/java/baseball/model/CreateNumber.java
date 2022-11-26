package baseball.model;// @ author ninaaano

import baseball.util.Converter;
import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class CreateNumber {


    public List<Integer> createComputerNumber(){
        List<Integer> computer = new ArrayList<>();
        while (computer.size() < 3) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    public List<Integer> makeNumber(int userInput){
        List<Integer> userNumber = Converter.change(String.valueOf(userInput));
        return userNumber;
    }


}
