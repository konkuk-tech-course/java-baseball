package baseball.model;// @ author ninaaano

import java.util.List;

public class Compare {

    CreateNumber createNumber;

//    // 심판
//    public enum judgement(){
//        strike,ball,nothing;
//    }

    /**
     * 스트라이크, 볼, 낫싱 계산하는 메서드 구현
    */

    public int strike(List<Integer> computer, List<Integer> userNumber){
        int strike = 0;
        for(int i=0; i<3; i++){
            if(computer.get(i) == userNumber.get(i)){
                strike += 1;
            }
        }
        return strike;
    }

    public int countBall(List<Integer> computer, List<Integer> userNumber){
        int count = 0;
        for(int i=0; i<3; i++){
            if (computer.contains(userNumber.get(i))){
                count += 1;
            }
        }
        return count;
    }

    // 비교
    public String compare(List<Integer> computer, List<Integer> userNumber){
        int strike = strike(computer, userNumber);
        int count = countBall(computer,userNumber);
        int ball = count-strike;

        String 낫싱 = getString(strike, ball);
        if (낫싱 != null) return 낫싱;

        return ball + "볼 " + strike + "스트라이크";
    }

    private String getString(int strike, int ball) {
        if(ball == 0 && strike == 0){
            return "낫싱";
        }
        if(strike == 0) {
            return ball + "볼";
        }
        if(ball == 0) {
            return strike + "스트라이크";
        }
        return null;
    }


}

