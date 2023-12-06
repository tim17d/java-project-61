package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_TOTAL = 3;

    public static void run(String gameTask, String[][] questionsWithCorrectAnswers) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var scanner = new Scanner(System.in);
        var playerName = scanner.next();
        System.out.println("Hello, " + playerName + "!");
        System.out.println(gameTask);

        for (int i = 0; i < ROUNDS_TOTAL; i++) {
            System.out.println("Question: " + questionsWithCorrectAnswers[i][0]);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(questionsWithCorrectAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. "
                        + "Correct answer was '" + questionsWithCorrectAnswers[i][1] + "'.");
                System.out.println("Let's try again, " + playerName + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + playerName + "!");
    }
}
