package Classes;

class Strings
{
    public static void main(String[] args)
    {
        String message = "Hello World";  // strings don't need new because there is string literal.
        System.out.println(message);

        String message2 = "Hello World" + "!!";  // string concatenation
        message.endsWith("d");  //will check if the string ends with a specific char
        message2.length();  // gets the length of the string
        message.indexOf("e");  //returns the index of the given char
        message.replace("H", "O");  //replaces a given target char with a given char. Does not change original string.e
        message2.trim();  //gets rid of extra white space

    }
}