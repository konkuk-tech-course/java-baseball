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
        List<Integer> userNumbers = convert.convertStringToIntegerList(userNumber);
        return userNumbers;
    }

    public int inputDefinition() {
        outputView.printDefinition();
        String definition = Console.readLine();
        validate.definition(definition);
        int definitionNumber = convert.convertDefinition(definition);
        return definitionNumber;
    }
}
