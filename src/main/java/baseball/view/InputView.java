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

    public int inputDestination() {
        outputView.printDefinition();
        String destination = Console.readLine();
        try {
            validate.destination(destination);
            int destinationNumber = convert.convertDefinition(destination);
            return destinationNumber;

        }catch (IllegalArgumentException e){
            outputView.printException(e.getMessage());
            return inputDestination();
        }
    }
}
