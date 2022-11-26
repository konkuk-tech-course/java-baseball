package baseball.view.constant;

import baseball.domain.Evaluation;

import java.util.Arrays;

public enum EvaluationStyle {
    BALL("볼", Evaluation.BALL),
    STRIKE("스트라이크", Evaluation.STRIKE);

    private final String style;
    private final Evaluation evaluation;

    private EvaluationStyle (String style, Evaluation evaluation) {
        this.style = style;
        this.evaluation = evaluation;
    }

    public static String findStyleByEvaluation(Evaluation evaluation) {
        return Arrays.stream(EvaluationStyle.values())
                .filter(style -> style.getEvaluation() == evaluation)
                .findAny()
                .orElseThrow()
                .getStyle();
    }

    public String getStyle() {
        return style;
    }

    public Evaluation getEvaluation() {
        return evaluation;
    }
}
