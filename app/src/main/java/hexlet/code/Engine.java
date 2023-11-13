package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_TOTAL = 3;

    public static void run(String gameTask, String[] questions, String[] correctAnswers) {
        Cli.greet();
        System.out.println(gameTask);
        var scanner = new Scanner(System.in);
        for (int i = 0; i < ROUNDS_TOTAL; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            var answer = scanner.next();
            if (answer.equals(correctAnswers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswers[i] + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
