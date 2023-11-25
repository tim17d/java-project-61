package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_TASK = "What is the result of the expression?";
    private static final String [] operations = new String[]{"+", "-", "*"};

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var operand1 = Utils.getRandomNumberBetween(0, 50);
            var operand2 = Utils.getRandomNumberBetween(0, 50);
            var operation = operations[Utils.getRandomNumberBetween(0, operations.length)];
            questionsWithCorrectAnswers[i][0] = operand1 + " " + operation + " " + operand2;
            switch (operation) {
                case "+" -> questionsWithCorrectAnswers[i][1] = Integer.toString(operand1 + operand2);
                case "-" -> questionsWithCorrectAnswers[i][1] = Integer.toString(operand1 - operand2);
                case "*" -> questionsWithCorrectAnswers[i][1] = Integer.toString(operand1 * operand2);
                default -> throw new RuntimeException("Wrong arithmetic operation. '+', '-' or '*' expected");
            }
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }
}
