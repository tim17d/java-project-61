package hexlet.code.games;

import hexlet.code.Cli;
import org.apache.commons.rng.simple.RandomSource;

import java.util.Scanner;

public class Even {
    public static void play() {
        Cli.greet();
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        var rng = RandomSource.JDK.create();
        var sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            var number = rng.nextInt(1000);
            System.out.println("Question: " + number);
            var correctAnswer = number % 2 == 0 ? "yes" : "no";
            System.out.print("Your answer: ");
            var answer = sc.next();
            if (answer.equals(correctAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
