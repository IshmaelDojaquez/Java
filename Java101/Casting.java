package Classes;

class Casting
{
    public static void main(String[] args)
    {
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // the smaller byte can be put into the larger byte
        // implicit casting
        // byte >> short >> int >> long

        String z = "4";
        int a = Integer.parseInt(z) + 3;  // converts string to number if possible
        System.out.println(a);

    }
}