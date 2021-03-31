package Classes;

class PrimitiveTypes
{
    public static void main(String[] args)
    {
        // Primitive types are for storing simple values
        // Type     Bytes[Memory]       Range
        // byte         1              [-128, 127]
        // short        2              [-32K, 32K]
        // int          4               [-2B, 2B]
        // long         8
        // float        4
        // double       8
        // char         2              'a' 'b' 'c'
        // boolean      1              true/false


        byte age = 30;
        int viewsCount = 123_456_789;  // use _ as a comma for larger numbers
        long viewsCount2 = 3_123_456_789L;  // use the L to distinguish a long. Capital L so it doesn't look like a 1
        double price = 10.99;
        float price2 = 10.99F;  // use the F to distinguish a float
        char letter = 'A';
        boolean isEligible = true;

    }
}
