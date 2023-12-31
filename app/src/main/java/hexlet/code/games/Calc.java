package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Calc {
    private static final String GAME_TASK = "What is the result of the expression?";
    private static final String[] OPERATIONS = new String[]{"+", "-", "*"};
    private static final int MIN_OPERAND_VALUE = 0;
    private static final int MAX_OPERAND_VALUE = 50;

    public static void play() {
        var questionsWithCorrectAnswers = new String[Engine.ROUNDS_TOTAL][2];
        for (int i = 0; i < Engine.ROUNDS_TOTAL; i++) {
            var operand1 = Utils.getRandomNumberBetween(MIN_OPERAND_VALUE, MAX_OPERAND_VALUE);
            var operand2 = Utils.getRandomNumberBetween(MIN_OPERAND_VALUE, MAX_OPERAND_VALUE);
            var operation = OPERATIONS[Utils.getRandomNumberBetween(0, OPERATIONS.length)];
            questionsWithCorrectAnswers[i][0] = operand1 + " " + operation + " " + operand2;
            questionsWithCorrectAnswers[i][1] = Integer.toString(calculate(operand1, operand2, operation));
        }
        Engine.run(GAME_TASK, questionsWithCorrectAnswers);
    }

    public static int calculate(int operand1, int operand2, String operation) {
        switch (operation) {
            case "+" -> {
                return operand1 + operand2;
            }
            case "-" -> {
                return operand1 - operand2;
            }
            case "*" -> {
                return operand1 * operand2;
            }
            default -> throw new RuntimeException("Wrong arithmetic operation. '+', '-' or '*' expected");
        }
    }
}
