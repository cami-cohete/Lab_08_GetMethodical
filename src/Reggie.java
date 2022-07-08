import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String UCNum = "";
        String menuChoice = "";

        SSN = SafeInput.getRegExString(in,"Enter your SSN","\\d{3}-\\d{2}-\\d{4}");
        System.out.println("Your SSN number is: " + SSN);

        UCNum = SafeInput.getRegExString(in,"Enter your UC M Number","(M|m)\\d{5}");
        System.out.println("Your UC M number is: " + UCNum);

        System.out.println("\nThe menu choices are Open, Save, View, and Quit [O-S-V-Q]");
        menuChoice = SafeInput.getRegExString(in,"Enter your menu choice", "[OoSsVvQq]");

        if (menuChoice.equalsIgnoreCase("o"))
        {
            System.out.println("Your menu choice is: Open");
        }
        else if (menuChoice.equalsIgnoreCase("s"))
        {
            System.out.println("Your menu choice is: Save");
        }
        else if (menuChoice.equalsIgnoreCase("v"))
        {
            System.out.println("Your menu choice is: View");
        }
        else
        {
            System.out.println("Your menu choice is: Quit");
        }
    }
}
