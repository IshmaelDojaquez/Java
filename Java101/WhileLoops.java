package Classes;

import java.util.Scanner;

class WhileLoops
{
    public static void main(String[] args)
    {
        int i = 0;
        while (i < 5)
        {
            System.out.println("Hello World");
            i++;
        }


        //Scanner object to take all inputs
        Scanner scanner = new Scanner(System.in);
        // empty string to start out input
        String input = "";
        //While input is not equal to the string "quit". Using .equals because it is a string
        while (!input.equals("quit"))
        {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}