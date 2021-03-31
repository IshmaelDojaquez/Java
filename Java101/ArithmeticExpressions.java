package Classes;

class ArithmeticExpressions
{
    public static void main(String[] args)
    {
        // + - * / and % are the arithmetic expressions in java
        // uses the same order of operations.
        // change the order of operations by using ()
        int result = 10 +3;
        System.out.println(result);

        int x = 1;
        x++;  // post increment
        --x;  // pre decrement
        x += 2;  // augmented assignment operator

        int result2 = (10 - 3) / 3 - (2 *9);
        System.out.println(result2);
    }
}