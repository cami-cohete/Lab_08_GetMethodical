import java.util.Scanner;

public class DevTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double shoeSize = 0;
        shoeSize = SafeInput.getRangedDouble(in, "What is your shoe size?", 5, 10);
        System.out.println("You said your shoe size is " + shoeSize);
    }


    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String userInput = "";
        boolean validInput = false;
        String trash = "";

        do {

        }while(!validInput);

        return userInput;
    }
}