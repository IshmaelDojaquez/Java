package Classes;

class EscapeSequence
{
    public static void main(String[] args)
    {
        // c:\Windows\..
        String message = "Hello \"Mosh\"";  // backslash allows you to insert certain char you otherwise wouldn't be able to
        String message2 = "\t c:\\Windows\\\n...";  // backslash n and backslash t
        System.out.println(message);
        System.out.println(message2);
    }
}