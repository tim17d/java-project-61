package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        var scanner = new Scanner(System.in);
        var gameNumber = scanner.next();
        switch (gameNumber) {
            case "1" -> Cli.greet();
            case "2" -> Even.play();
            case "3" -> Calc.play();
            case "4" -> GCD.play();
            default -> {
            }
        }
    }
}
