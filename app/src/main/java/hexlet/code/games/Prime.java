package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Prime {
    private static final String GAME_TASK = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number = Utils.getRandomNumberBetween(0, 1000);
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
