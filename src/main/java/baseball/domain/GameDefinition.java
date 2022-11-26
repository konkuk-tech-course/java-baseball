package baseball.domain;

import baseball.view.InputView;

public class GameDefinition {

    static boolean judge(InputView inputView) {
        int definitionNumber = inputView.inputDefinition();
        if(definitionNumber==1){
            return true;
        }
        return false;
    }

}
