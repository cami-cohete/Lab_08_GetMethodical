import java.util.Scanner;

public class SafeInput
{
    /**
     *
     * @param pipe a Scanner opened to read from System.in
     * @param prompt prompt for the user
     * @return a String response that is not zero length
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retString = "";  // Set this to zero length. Loop runs until it isn’t
        do
        {
            System.out.print("\n" + prompt + ": "); // show prompt add space
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }



    public static int getInt(Scanner pipe, String prompt)
    {
        String trash = "";
        int userInt = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextInt())
            {
                userInt = pipe.nextInt();
                pipe.nextLine();
                validInput = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid input: " + trash);
            }
        }while(!validInput);

        return userInt;
    }



    public static double getDouble(Scanner pipe, String prompt)
    {
        String trash = "";
        double userDouble = 0;
        boolean validInput = false;

        do {
            System.out.print("\n" + prompt + ": ");
            if (pipe.hasNextDouble())
            {
                userDouble = pipe.nextDouble();
                pipe.nextLine();
                validInput = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("Please enter a valid input: " + trash);
            }
        }while(!validInput);

        return userDouble;
    }



    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int userInput = 0;
        boolean validInput = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                userInput = pipe.nextInt();
                pipe.nextLine(); // clear input buffer
                if(userInput >= low && userInput <= high)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + userInput);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + low + " - " + high + "]: " + trash);
            }

        }while(!validInput);

        return userInput;
    }



    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double userInput = 0;
        boolean validInput = false;
        String trash = "";
        do
        {
            System.out.print(prompt + "[" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                userInput = pipe.nextDouble();
                pipe.nextLine(); // clear input buffer
                if(userInput >= low && userInput <= high)
                {
                    validInput = true;
                }
                else
                {
                    System.out.println("You must enter a value in range [" + low + " - " + high + "]: " + userInput);
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an int [" + low + " - " + high + "]: " + trash);
            }

        }while(!validInput);

        return userInput;
    }
}
