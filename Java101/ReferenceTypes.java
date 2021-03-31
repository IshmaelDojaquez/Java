package Classes;

import java.util.Date;

class ReferenceTypes
{
    public static void main(String[] args)
    {
        // Reference Types are for storing complex objects
        // All other types, that are not primitive types, are reference types
        byte age = 30;
        Date now = new Date();  // you have to use new to allocate memory space for the reference type

        // Objects are an instance of a class
        now.getTime();  //reference types have methods you can use
        System.out.println(now);

    }
}