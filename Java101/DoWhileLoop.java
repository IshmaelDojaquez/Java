package Classes;

import java.util.Scanner;

class DoWhileLoop
{
    public static void main(String[] args)
    {
        // will execute at least once

        Scanner scanner = new Scanner(System.in);
        String input = "";
        do
        {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }while (!input.equals("quit"));
    }
}