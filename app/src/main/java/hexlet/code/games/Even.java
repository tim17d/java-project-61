package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private static final int MIN_NUMBER_VALUE = 0;
    private static final int MAX_NUMBER_VALUE = 1000;

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number = Utils.getRandomNumberBetween(MIN_NUMBER_VALUE, MAX_NUMBER_VALUE);
            questionsWithCorrectAnswers[i][0] = Integer.toString(number);
            questionsWithCorrectAnswers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
