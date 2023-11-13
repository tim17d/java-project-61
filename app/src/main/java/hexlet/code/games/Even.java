package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final String GAME_TASK = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    public static void play() {
        var questions = new String[Engine.ROUNDS_TOTAL];
        var correctAnswers = new String[Engine.ROUNDS_TOTAL];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var number = Utils.getRandomNumberBetween(0, 1000);
            questions[i] = Integer.toString(number);
            correctAnswers[i] = number % 2 == 0 ? "yes" : "no";
        }
        Engine.run(GAME_TASK, questions, correctAnswers);
    }
}
