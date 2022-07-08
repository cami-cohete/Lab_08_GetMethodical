public class PrettyHeader
{
    public static void main(String[] args)
    {
        String output = "";
        String msg = "Hi";
        String msg1 = "My favorite food is tacos";
        String msg2 = "I also Love Bananas";
        String msg3 = "I am a bookworm who has attention problems";

        SafeInput.prettyHeader(msg);
        System.out.println();
        SafeInput.prettyHeader(msg1);
        System.out.println();
        SafeInput.prettyHeader(msg2);
        System.out.println();
        SafeInput.prettyHeader(msg3);
    }

}