package baseball.controller;// @ author ninaaano

import baseball.model.Compare;
import baseball.model.CreateNumber;
import baseball.view.InputView;

import java.util.List;

import static baseball.view.InputView.restart;

public class GameController {

    InputView inputView;
    Compare compare;
    CreateNumber createNumber;
    //List<Integer> computer;
    List<Integer> userNumber;

    public void start(){
        System.out.println("숫자 야구 게임을 시작합니다.");
        List<Integer> computer = createNumber.createComputerNumber();
            while (true) {
                //computer = createNumber.createComputerNumber();
                userNumber = createNumber.makeNumber(InputView.inputNumber());
                String result = "";
                while (!result.equals("3스트라이크")) {
                    result = compare.compare(computer,userNumber);
                    System.out.println(result);
                }
                if (!reStart(String.valueOf(restart()))) break;
            }
    }


    // 게임 재시작
    public boolean reStart(String userInput){
        if(userInput.equals("1")){
            return true;
        }
        if(userInput.equals("2")){
            return false;
        }
        throw new IllegalStateException();
    }

    public boolean gameSet(){
        return true; // 3스트라이크일때
    }
}
