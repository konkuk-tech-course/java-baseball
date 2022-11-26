# 숫자야구
기본적으로 1부터 9까지 서로 다른 수로 이루어진 3자리의 수를 맞추는 게임이다.

- [x] 게임 시작 Controller#startGame()
- [x] 야구 게임 시작 메시지 출력 Print
- [x] 랜덤 숫자 3개 생성 NumberGenerator#numberGenerate()
  - [x] 각 숫자는 중복되지 않는가? Baseball#checkDuplication()
  - [x] 각 숫자는 1~9까지 숫자인가? Baseball#checkValidRange()
- [x] 숫자 입력 UserInput#askNumbers()
  - [x] 숫자로 파싱 UserInput#readInt()
  - [x] 숫자 배열로 파싱 UserInput#getSeparate()
  - [x] 받은 숫자로 baseball 반환 UserInput#askInputBaseball()
  - 예외처리
    - [x] 숫자인가? UserInput#vaildNumber()
    - [x] 각 숫자는 중복되지 않는가? Baseball#checkDuplication()
    - [x] 각 숫자는 1~9까지 숫자인가? Baseball#checkValidRange()
    - [x] 숫자가 3개인가? Baseball#checkSize()
    - [x] 예외 발생시 다시 입력
- [x] 정답 숫자와 비교 BaseballJudge#judgement
  - [x] 숫자가 같고, 자리수가 다르면 '볼' BaseballJudge#getBall
  - [x] 숫자가 같고, 자리수도 같으면 '스트라이크' BaseballJudge#getStrike
  - [x] ball, strike가 둘다 없으면 '낫싱' JudgementType#isNothing
  - [x] 에러 발생시 다시 입력받기
- [x] 정답인지 확인 BaseballJudge#checkAnswer
  - [x] 3스트라이크 시 정답 
- [x] 게임 재시작 BaseballController#retry
  - [x] 1 입력시 재시작 Controller#gameStart
  - [x] 2 입력시 종료
  - [x] 그 외 입력시 다시 입력받기

