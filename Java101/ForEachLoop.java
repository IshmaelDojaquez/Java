package Classes;

class ForEachLoop
{
    public static void main(String[] args)
    {
        String[] fruits = {"Apple", "Mango", "Orange"};
        {
            //foreach statement. Syntax is type, variable name, :, whatever is being iterated through
            for(String fruit : fruits)
                System.out.println(fruit);
        }
    }
}