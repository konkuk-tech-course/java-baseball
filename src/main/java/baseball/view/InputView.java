package baseball.view;

import baseball.util.Convert;
import baseball.util.Validate;
import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputView {

    private Validate validate = new Validate();
    private OutputView outputView = new OutputView();
    private Convert convert = new Convert();

    List<Integer> userNumbers = new ArrayList<>();
    public List<Integer> inputUserNumber(){
        outputView.printInputUser();
        String userNumber = Console.readLine();
        try {
            validate.userNumber(userNumber);
            userNumbers = convert.convertUserNumber(userNumber);
            return userNumbers;
        }catch(IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return inputUserNumber();
        }
    }

    public int inputDefinition() {
        outputView.printDefinition();
        String definition = Console.readLine();
        try {
            validate.definition(definition);
            int definitionNumber = convert.convertDefinition(definition);
            return definitionNumber;

        }catch (IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return inputDefinition();
        }
    }
}
