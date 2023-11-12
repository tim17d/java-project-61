package hexlet.code.games;

import hexlet.code.Cli;
import org.apache.commons.rng.simple.RandomSource;

import java.util.Scanner;

public class Calc {
    public static void play() {
        Cli.greet();
        System.out.println("What is the result of the expression?");
        var rng = RandomSource.JDK.create();
        var sc = new Scanner(System.in);
        var operations = new String[]{"+", "-", "*"};
        for (int i = 0; i < 3; i++) {
            var operationNumber = rng.nextInt(3);
            var operand1 = rng.nextInt(100);
            var operand2 = rng.nextInt(100);
            int result;
            if (operationNumber == 0) {
                result = operand1 + operand2;
            } else if (operationNumber == 1) {
                result = operand1 - operand2;
            } else {
                result = operand1 * operand2;
            }
            System.out.println("Question: " + operand1 + " " + operations[operationNumber] + " " + operand2);
            System.out.print("Your answer: ");
            var answer = sc.nextInt();
            if (answer == result) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + result + "'.");
                System.out.println("Let's try again, " + Cli.getPlayerName() + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + Cli.getPlayerName() + "!");
    }
}
