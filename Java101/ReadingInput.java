package Classes;

import java.util.Scanner;

class ReadingInput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Age: ");  //println adds a new line after the statement. print does not.
        byte age = scanner.nextByte();  //scanner takes input after message. specific to the type of the variable
        System.out.println("You are" + age);

        System.out.print("Name: ");
        String name = scanner.next().trim(); //  next method own takes in one token. Use nextLine to get multiple tokens
        System.out.println("You are" + name);
    }
}