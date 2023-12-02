package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import java.util.StringJoiner;

public class Progression {
    private static final String GAME_TASK = "What number is missing in the progression?";

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var progressionSize = Utils.getRandomNumberBetween(5, 20);
            var firstTerm = Utils.getRandomNumberBetween(0, 100);
            var difference = Utils.getRandomNumberBetween(1, 11);
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
