package Classes;

import java.util.Scanner;

class BreakContinue
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (true)  // will always be true so need break statement or you create an infinite loop
        {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if(input.equals("Pass"))
                continue;  // moves control to the beginning of the loop
            if(input.equals("quit"))
                break;  // ignores everything else after and terminates the loop
            System.out.println(input);
        }
    }
}