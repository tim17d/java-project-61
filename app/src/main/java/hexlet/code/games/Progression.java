package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    private static final String GAME_TASK = "What number is missing in the progression?";

    public static void play() {
        var questions = new String[Engine.ROUNDS_TOTAL];
        var correctAnswers = new String[Engine.ROUNDS_TOTAL];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var progression = getProgression();
            var hiddenElementIndex = Utils.getRandomNumberBetween(0, progression.length);
            questions[i] = progressionToQuestion(progression, hiddenElementIndex);
            correctAnswers[i] = Integer.toString(progression[hiddenElementIndex]);
        }
        Engine.run(GAME_TASK, questions, correctAnswers);
    }

    public static int[] getProgression() {
        var progressionSize = Utils.getRandomNumberBetween(5, 20);
        var firstTerm = Utils.getRandomNumberBetween(0, 100);
        var difference = Utils.getRandomNumberBetween(1, 11);
        var progression = new int[progressionSize];
        progression[0] = firstTerm;
        for (int i = 1; i < progressionSize; i++) {
            progression[i] = progression[i - 1] + difference;
        }
        return progression;
    }

    public static String progressionToQuestion(int[] progression, int hiddenElementIndex) {
        var sj = new StringJoiner(" ");
        for (int i = 0; i < progression.length; i++) {
            if (i != hiddenElementIndex) {
                sj.add(Integer.toString(progression[i]));
            } else {
                sj.add("..");
            }
        }
        return sj.toString();
    }
}
