package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class GCD {
    private static final String GAME_TASK = "Find the greatest common divisor of given numbers.";

    public static void play() {
        var questions = new String[Engine.ROUNDS_TOTAL];
        var correctAnswers = new String[Engine.ROUNDS_TOTAL];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number1 = Utils.getRandomNumberBetween(0, 100);
            var number2 = Utils.getRandomNumberBetween(0, 100);
            questions[i] = number1 + " " + number2;
            correctAnswers[i] = Integer.toString(getGcd(number1, number2));
        }
        Engine.run(GAME_TASK, questions, correctAnswers);
    }

    private static int getGcd(int a, int b) {
        return (a % b == 0) ? Math.abs(b) : getGcd(b, a % b);
    }
}
