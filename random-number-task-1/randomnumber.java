import java.util.Scanner;
import java.util.Random;

class randomnumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 7;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Guess it!");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt #" + attempt + ": Enter your guess: ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You've guessed the correct number!");
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }

                if (attempt == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + randomNumber);
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }

        System.out.println("Your final score is: " + score);
        scanner.close();
    }
}
