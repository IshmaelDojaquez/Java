package Classes;

class Variables
{
    public static void main(String[] args)
    {
        // naming convention is capitalization at beginning of each new word
        int myAge = 30;  // type of variable, variable identifier, assignment operator, followed by value
        myAge = 35;  // you can change the value stored in the variable
        System.out.println(myAge);  // you can print out a variable

        int temperature = 20,  height = 70;  // you can declare multiple variable on one line but it is not good syntax
        int herAge = myAge;
        System.out.println(herAge);
    }
}