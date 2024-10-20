import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args) {
        boolean loopGame = true;
        do
        {
            Random rnd = new Random();
            Scanner in = new Scanner(System.in);
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int crapsRoll = die1 + die2;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum (Die 1 + Die 2): " + crapsRoll + "\n");
            loopGame = false;
            boolean sumLoop = true;
            if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("You got a natural. You win!\n");
                System.out.print("Play Again (Y/N): ");
                String playAgain = in.next();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    loopGame = true;
                }

            }
            else if(crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("You crapped out! You lost!\n");
                System.out.print("Play Again (Y/N): ");
                String playAgain = in.next();
                if (playAgain.equalsIgnoreCase("Y"))
                {
                    loopGame = true;
                }
            }
            else
            {
                int point = crapsRoll;
                System.out.println("The sum is now the point: " + point + "\n");
                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    int otherRoll = die1 + die2;
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Sum: " + otherRoll + "\n");
                    if (otherRoll == 7) {
                        sumLoop = false;
                        System.out.println("You got a 7! You lost!\n");
                        System.out.print("Play Again (Y/N): ");
                        String playAgain = in.next();
                        if (playAgain.equalsIgnoreCase("Y")) {
                            loopGame = true;
                        }

                    } else if (otherRoll == crapsRoll)
                    {
                        sumLoop = false;
                        System.out.println("You got the point sum! You win!\n");
                        System.out.print("Play Again (Y/N): ");
                        String playAgain = in.next();
                        if (playAgain.equalsIgnoreCase("Y"))
                        {
                            loopGame = true;
                        }
                    }

                } while(sumLoop);


            }
        }
        while (loopGame);
        System.out.println("Thanks for playing");

    }
}