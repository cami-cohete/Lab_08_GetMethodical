import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        double fahrenheit = 0;

        for (int row = 1; row <= 100; row++)
        {
                fahrenheit = CtoF(row);

                System.out.printf("%-6d", row);
                System.out.print(fahrenheit + "\n");
        }
    }



    public static double CtoF(double celsius)
    {
        double fahrenheit = 0;

        fahrenheit = (9/5 * celsius) + 32;

        return fahrenheit;
    }
}
// Now code a program that creates a tabular display of two columns with the Celsius
// value on the left and the equivalent Fahrenheit value on the right. The table
// should show degrees centigrade in 1 degree increments from -100 to 100.