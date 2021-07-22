package hexlet.code;

import java.util.Scanner;
import java.util.Random;

public class Engine {
    private static String name;
    private static final Scanner input = new Scanner(System.in);
    private static final int ROUNDS = 3;
    public static final Random RANDOM = new Random();
    public static final int END_BOUND = 100;
    public static final String[][] sentences = new String[3][2];

    public static void interact() {
        for (int i = 0; i < ROUNDS; i++) {
            String question = Engine.sentences[i][0];
            String correct = Engine.sentences[i][1];

            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String answer = input.nextLine();
            if (answer.equals(correct)) {
                System.out.println("Correct!");
            } else {
                System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.%n", answer, correct);
                System.out.printf("Let's try again, %s!%n", name);
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n",name);
    }

    public static void greeting() {
        System.out.print("May I have your name? ");
        name = input.nextLine();
        System.out.printf("Hello, %s!%n", name);
    }
}
