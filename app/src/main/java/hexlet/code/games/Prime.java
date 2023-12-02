package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    private static final int MIN_NUMBER_VALUE = 0;
    private static final int MAX_NUMBER_VALUE = 1000;

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number = Utils.getRandomNumberBetween(MIN_NUMBER_VALUE, MAX_NUMBER_VALUE);
            questionsWithCorrectAnswers[i][0] = Integer.toString(number);
            questionsWithCorrectAnswers[i][1] = isPrime(number) ? "yes" : "no";
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        boolean result = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }
}
