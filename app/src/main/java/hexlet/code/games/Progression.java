package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    private static final String GAME_TASK = "What number is missing in the progression?";
    private static final int MIN_PROGRESSION_SIZE = 5;
    private static final int MAX_PROGRESSION_SIZE = 20;
    private static final int MIN_FIRST_TERM_VALUE = 0;
    private static final int MAX_FIRST_TERM_VALUE = 100;
    private static final int MIN_DIFFERENCE_VALUE = 1;
    private static final int MAX_DIFFERENCE_VALUE = 11;

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var progressionSize = Utils.getRandomNumberBetween(MIN_PROGRESSION_SIZE, MAX_PROGRESSION_SIZE);
            var firstTerm = Utils.getRandomNumberBetween(MIN_FIRST_TERM_VALUE, MAX_FIRST_TERM_VALUE);
            var difference = Utils.getRandomNumberBetween(MIN_DIFFERENCE_VALUE, MAX_DIFFERENCE_VALUE);
            var progression = getProgression(progressionSize, firstTerm, difference);
            var hiddenElementIndex = Utils.getRandomNumberBetween(0, progression.length);
            questionsWithCorrectAnswers[i][0] = progressionToQuestion(progression, hiddenElementIndex);
            questionsWithCorrectAnswers[i][1] = Integer.toString(progression[hiddenElementIndex]);
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    public static int[] getProgression(int progressionSize, int firstTerm, int difference) {
        var progression = new int[progressionSize];
        for (int i = 0; i < progressionSize; i++) {
            progression[i] = difference * i + firstTerm;
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
