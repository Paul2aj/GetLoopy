import java.util.Random;
import java.util.Scanner;

public class DieRoller {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain = "";
        int roll = 0;
        int die1 = 0;
        int die2 = 0;
        int die3 = 0;
        int sum = 0;

        do {
            System.out.printf("Roll       Die1       Die2      Die3      Sum%n");
            System.out.println("--------------------------------------------");

            do {
                roll++;

                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                die3 = rnd.nextInt(6) + 1;

                sum = die1 + die2 + die3;
                System.out.printf("%-6d %-6d %-6d %-6d %-6d%n", roll, die1, die2, die3, sum);
            } while (die1 != die2 || die2 != die3);
            System.out.print("Do you want to roll again? enter Y or N ");
            playAgain = in.nextLine();
        } while (playAgain.equalsIgnoreCase("y"));
        System.out.println("Thanks for playing!");
    }
}
