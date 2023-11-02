package hexlet.code;

import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.\n" +
                "1 - Greet\n" +
                "2 - Even\n" +
                "0 - Exit");
        System.out.print("Your choice: ");
        var sc = new Scanner(System.in);
        var gameNumber = sc.nextInt();
        switch (gameNumber) {
            case 1:
                Cli.greet();
                break;
            case 2:
                Even.play();
                break;
            default:
                break;
        }
    }
}
