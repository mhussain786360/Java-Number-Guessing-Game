import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int number = (int)(Math.random()*100);
        int guess = 0;
        do {
            System.out.println("Guess the number between 0 and 100");
            guess = num.nextInt();
            if (guess == number) {
                System.out.println("You guessed the number");
                break;
            }
            else if (guess > number) {
                System.out.println("You did not guess the number");
                System.out.println("Your number is large");
            }
            else {
                System.out.println("You did not guess the number");
                System.out.println("Your number is small");
            }
        }
        while(guess >= 0 && guess <= 100);
        System.out.println("My number was " + number);
    }
}