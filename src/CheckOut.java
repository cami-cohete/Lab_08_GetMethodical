import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double priceOfItem = 0;
        double totalCost = 0;
        boolean done = false;

        do {
            priceOfItem = SafeInput.getRangedDouble(in,"What is the price of your item?", 0.5, 9.99);
            totalCost = totalCost + priceOfItem;

            done = SafeInput.getYNConfirm(in,"Do you want to add another item?");

        }while (done);

        System.out.printf("The total cost of your purchase is %.2f", totalCost);
    }
}
