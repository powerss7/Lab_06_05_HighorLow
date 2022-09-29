import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random generator = new Random();

        int RanNum = generator.nextInt(10) + 1;
        int UserInput = 0;
        String trash = "";

        System.out.println(RanNum);

        System.out.print("try to guess the number I am thinking of [1 and 10] ");
        if(in.hasNextInt())
        {
            UserInput = in.nextInt();
            in.nextLine();
            if(UserInput >= 1 && UserInput <= 10)
            {
                if (UserInput == RanNum)
                {
                    System.out.println("you guessed right");
                }
                if (UserInput < RanNum)
                {
                    System.out.println("you guessed to low");
                }
                else if (UserInput > RanNum)
                {
                    System.out.println("you guessed to high");
                }
            }
            else
            {
                System.out.println("you said your fav num is " + UserInput + " but that is out of range");
                System.exit(0);
            }
        }
        else
        {
            trash = in.nextLine();
            System.out.println(trash + " is not a valid number");
            System.exit(0);
        }
    }
}