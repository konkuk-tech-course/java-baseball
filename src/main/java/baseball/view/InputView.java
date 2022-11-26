package baseball.view;

import baseball.util.Convert;
import baseball.util.Validate;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {

    Validate validate = new Validate();
    OutputView outputView = new OutputView();
    Convert convert = new Convert();
    public List<Integer> inputUserNumber(){
        outputView.printInputUser();
        String userNumber = Console.readLine();
        validate.userNumber(userNumber);
        List<Integer> userNumbers = convert.convertStringToInteger(userNumber);
        return userNumbers;
    }

}
