import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // ANSI color codes for styling
        final String RESET = "\u001B[0m";
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String YELLOW = "\u001B[33m";
        final String BLUE = "\u001B[34m";
        final String CYAN = "\u001B[36m";

        Scanner num = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int guess = -1;
        int steps = 0; // Counter for the number of steps

        System.out.println(CYAN + "****************************************" + RESET);
        System.out.println(YELLOW + "          Welcome to the Game!" + RESET);
        System.out.println(CYAN + "****************************************" + RESET);

        do {
            System.out.println(BLUE + "Guess the number between 0 and 100:" + RESET);
            guess = num.nextInt();
            steps++; // Increment the step counter

            if (guess == number) {
                System.out.println(GREEN + "Congratulations! You guessed the number in " + steps + " steps." + RESET);
                break;
            } else if (guess > number) {
                System.out.println(RED + "Wrong guess!" + RESET);
                System.out.println(YELLOW + "Hint: Your number is too high." + RESET);
            } else {
                System.out.println(RED + "Wrong guess!" + RESET);
                System.out.println(YELLOW + "Hint: Your number is too low." + RESET);
            }
        } while (guess >= 0 && guess <= 100);

        System.out.println(CYAN + "****************************************" + RESET);
        System.out.println(GREEN + "The correct number was: " + number + RESET);
        System.out.println(CYAN + "****************************************" + RESET);
    }
}
