import java.util.Scanner;

public class FavNumbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int favNum = 0;
        double favDouble = 0;

        favNum = SafeInput.getInt(in,"What is your favorite number [integer]");
        System.out.println("You said your favorite number is: " + favNum);

        favDouble = SafeInput.getDouble(in,"What is your favorite double number?");
        System.out.println("You said your favorite double number is: ");
    }
}
