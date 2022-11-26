package baseball.view;

import baseball.util.Validate;
import camp.nextstep.edu.missionutils.Console;

public class InputView {

    Validate validate = new Validate();
    public void inputUserNumber(){
        System.out.print("숫자를 입력해주세요 : ");
        String userNumber = Console.readLine();
        validate.userNumber(userNumber);


    }

}
