package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number = Utils.getRandomNumberBetween(0, 1000);
            questionsWithCorrectAnswers[i][0] = Integer.toString(number);
            questionsWithCorrectAnswers[i][1] = isEven(number) ? "yes" : "no";
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
