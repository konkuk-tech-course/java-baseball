package baseball.view;

public class OutputView {

    public void printStart() {
        System.out.println("숫자 야구 게임을 시작합니다.");
    }

    public void printInputUser() {
        System.out.print("숫자를 입력해주세요 : ");
    }

    public void printResult(String print, int strike) {
        System.out.println(print);
        if(strike==3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
    }


}
