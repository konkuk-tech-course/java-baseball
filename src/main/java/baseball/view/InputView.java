package baseball.view;

import baseball.util.Convert;
import baseball.util.Validate;
import camp.nextstep.edu.missionutils.Console;
import java.util.List;

public class InputView {

    private Validate validate = new Validate();
    private OutputView outputView = new OutputView();
    private Convert convert = new Convert();
    public List<Integer> inputUserNumber(){
        outputView.printInputUser();
        String userNumber = Console.readLine();
        validate.userNumber(userNumber);
        List<Integer> userNumbers = convert.convertUserNumber(userNumber);
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
