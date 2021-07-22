package hexlet.code.games;

import hexlet.code.Cli;
import hexlet.code.Engine;

public class Prime {
    private static final int[] PRIMES = new int[] {2, 3, 5, 7, 11};

    public static void prime() {
        Cli.greeting();
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        for (int i = 0; i < Engine.ROUNDS; i++) {
            int num = Engine.randomNum(Engine.END_BOUND);
            String question = String.format("%d", num);
            String correct = filter(num);
            boolean isSuccess = Engine.interact(question, correct);
            if (!isSuccess) {
                return;
            }
        }
        System.out.printf("Congratulations, %s!%n", Cli.getName());
    }

    private static String filter(int num) {
        for (int prime : PRIMES) {
            if (num == 1) {
                return "no";
            } else if (num == prime) {
                return "yes";
            } else if (num % prime == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
