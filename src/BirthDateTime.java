import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int userYear = 0;
        int userMonth = 0;
        int userDay = 0;
        int userHours = 0;
        int userMinutes = 0;
        boolean correctDay = false;

        userYear = SafeInput.getRangedInt(in,"What year where you born in?", 1950, 2010);
        userMonth = SafeInput.getRangedInt(in,"What month where you born in?",1,12);

        switch (userMonth)
        {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                userDay = SafeInput.getRangedInt(in, "What day where you born in?", 1, 31);
                break;
            case 2:
                 userDay = SafeInput.getRangedInt(in, "What day where you born in?", 1, 28);
                 break;
            case 4:
            case 6:
            case 9:
            case 11:
                userDay = SafeInput.getRangedInt(in, "What day where you born in?", 1, 30);
                break;
        }

        userHours = SafeInput.getRangedInt(in,"What hour where you born at?",1,24);
        userMinutes =  SafeInput.getRangedInt(in,"What minute where you born at?",1,60);

        System.out.println("You where born on " + userMonth + "/" + userDay + "/" + userYear + " at " + userHours + ":" + userMinutes + ".");
    }
}
