package baseball.view;

import baseball.domain.Evaluation;
import baseball.view.constant.EvaluationStyle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OutputView {
    private static OutputView instance = new OutputView();
    private static final int NOTHING_COUNT = 0;
    private static final String NOTHING_STYLE = "낫싱";
    private static final String EMPTY = "";
    private static final String DELIMITER = " ";

    private OutputView() {}

    public static OutputView getInstance() {
        return instance;
    }

    public void printEvaluation(Map<Evaluation, Integer> evaluation) {
        System.out.println(createEvaluationPhrase(evaluation));
    }

    private String createEvaluationPhrase(Map<Evaluation, Integer> evaluation) {
        if (isNothing(evaluation)) {
            return NOTHING_STYLE;
        }
        List<String> evaluationPhraseElements = new ArrayList<>();
        evaluationPhraseElements.add(createBallPhrase(evaluation.get(Evaluation.BALL)));
        evaluationPhraseElements.add(createBallPhrase(evaluation.get(Evaluation.STRIKE)));
        return String.join(DELIMITER, evaluationPhraseElements)
                .trim();
    }

    private boolean isNothing(Map<Evaluation, Integer> evaluation) {
        return evaluation.values().stream()
                .allMatch(count -> count == NOTHING_COUNT);
    }

    private String createBallPhrase(int ballCount) {
        if (ballCount == NOTHING_COUNT) {
            return EMPTY;
        }
        return ballCount + EvaluationStyle.findStyleByEvaluation(Evaluation.BALL);
    }

    private String createStrikePhrase(int strikeCount) {
        if (strikeCount == NOTHING_COUNT) {
            return EMPTY;
        }
        return strikeCount + EvaluationStyle.findStyleByEvaluation(Evaluation.STRIKE);
    }
}
