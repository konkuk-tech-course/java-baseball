# :pushpin: 숫자 야구 게임 미션 기능 목록

## 구현 기능 목록
<details>
<summary><b>입력</b></summary>
<div markdown="1">

- [x] 서로 다른 3자리의 수를 아래와 같은 형식으로 입력 받기
```
숫자를 입력해주세요 : 123
```
> - **예외처리**
> - [x] 문자 입력시 -> Util
> - [x] 공백 입력시  -> Util
> - [x] 세자리 이상 입력시 -> Validator
> - [x] 중복된 숫자 입력시 -> Validator


-[ ] 게임 재시작 문구 입력 받기
```
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
```

> - **예외처리**
> - [x] 문자 입력시 -> Util
> - [x] 공백 입력시  -> Util
> - [x] 음수나 한 글자 이상일 경우 에러메세지 출력
> - [x] 1이나 2가 아닐시 에러메세지 출력

</div>
</details>

<details>
<summary><b>출력</b></summary>
<div markdown="1">

- [x] 게임 시작 문구 출력
```
숫자 야구 게임을 시작합니다.
```

- [x] 입력한 수에 대한 결과를 볼, 스트라이크 개수로 표시한다
> - [x] 아래와 같은 형식을 준수한다.
```
1볼 1스트라이크
```
-[x] 하나도 없는경우 -> 낫싱 출력
- [x] 3개의 숫자를 모두 맞힐 경우 아래 문구 출력

```
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
```


</div>
</details>

<details> 
<summary><b>체크리스트 및 구현 로직</b></summary>
<div markdown="1">

- [x] 1에서 9까지 서로 다른 임의의 수 3개를 선택하는 컴퓨터 구현

</div>
</details>

### 테스트 할 목록
