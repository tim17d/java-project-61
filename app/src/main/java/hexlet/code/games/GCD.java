package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";
    private static final int MIN_NUMBER_VALUE = 0;
    private static final int MAX_NUMBER_VALUE = 100;

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number1 = Utils.getRandomNumberBetween(MIN_NUMBER_VALUE, MAX_NUMBER_VALUE);
            var number2 = Utils.getRandomNumberBetween(MIN_NUMBER_VALUE, MAX_NUMBER_VALUE);
            questionsWithCorrectAnswers[i][0] = number1 + " " + number2;
            questionsWithCorrectAnswers[i][1] = Integer.toString(getGcd(number1, number2));
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    private static int getGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : getGcd(b, a % b);
    }
}
