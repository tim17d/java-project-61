package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    private static final String GREETING = "1";
    private static final String EVEN_GAME = "2";
    private static final String CALC_GAME = "3";
    private static final String GCD_GAME = "4";
    private static final String PROGRESSION_GAME = "5";
    private static final String PRIME_GAME = "6";

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n"
                + "1 - Greet\n"
                + "2 - Even\n"
                + "3 - Calc\n"
                + "4 - GCD\n"
                + "5 - Progression\n"
                + "6 - Prime\n"
                + "0 - Exit");
        System.out.print("Your choice: ");
        var scanner = new Scanner(System.in);
        var gameNumber = scanner.next();
        switch (gameNumber) {
            case GREETING -> Cli.greet();
            case EVEN_GAME -> Even.play();
            case CALC_GAME -> Calc.play();
            case GCD_GAME -> GCD.play();
            case PROGRESSION_GAME -> Progression.play();
            case PRIME_GAME -> Prime.play();
            default -> {
            }
        }
    }
}
