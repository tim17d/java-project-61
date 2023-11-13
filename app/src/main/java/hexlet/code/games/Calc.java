package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_TASK = "What is the result of the expression?";

    public static void play() {
        var operations = new String[]{"+", "-", "*"};
        var questions = new String[Engine.ROUNDS_TOTAL];
        var correctAnswers = new String[Engine.ROUNDS_TOTAL];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var operand1 = Utils.getRandomNumberBetween(0, 50);
            var operand2 = Utils.getRandomNumberBetween(0, 50);
            var operation = operations[Utils.getRandomNumberBetween(0, 3)];
            questions[i] = operand1 + " " + operation + " " + operand2;
            switch (operation) {
                case "+" -> correctAnswers[i] = Integer.toString(operand1 + operand2);
                case "-" -> correctAnswers[i] = Integer.toString(operand1 - operand2);
                case "*" -> correctAnswers[i] = Integer.toString(operand1 * operand2);
                default -> {
                }
            }
        }
        Engine.run(GAME_TASK, questions, correctAnswers);
    }
}
