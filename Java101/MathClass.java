package Classes;

class MathClass
{
    public static void main(String[] args)
    {
        int result = Math.round(1.1F);  // rounds to the nearest whole number
        result = (int)Math.ceil((1.1F));  // finds the ceiling of that number
        result = (int)Math.floor(1.1F);  //finds the floor of that number
        result = Math.max(1, 2); // returns the bigger of the two numbers
        result = Math.min(1,2);  //returs the larger of the two
        double result2 = Math.random() * 100;  // returns a double between 0 -1
        double result3 = Math.round(Math.random() * 100);  // multiple by 100 and then randomizer it
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
    }
}