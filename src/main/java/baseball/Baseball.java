package baseball;public class Baseball {
    private void checkValidRange(List<Integer> numbers) {
        for (int num : numbers) {
            if (1 > num || num > 9) {
                throw new IllegalArgumentException("[ERROR] 각 숫자는 1이상 9이하로 입력해주세요.");
            }
        }
    }
}
