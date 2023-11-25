package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void greet() {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        var sc = new Scanner(System.in);
        var playerName = sc.next();
        System.out.println("Hello, " + playerName + "!");
    }
}
