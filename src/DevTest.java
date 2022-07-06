import java.util.Scanner;

public class DevTest
{

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String nickname = "";

        nickname = SafeInput.getNonZeroLenString(in, "What is your nickname?");
        System.out.println("You said your nickname is: " + nickname);

    }
}