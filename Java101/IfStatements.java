package Classes;

class IfStatements
{
    public static void main(String[] args)
    {
        //if, else if, and else
        int temp = 32;
        if(temp > 30)
        {
            System.out.println("Its a hot day");
        }
        else if (temp > 20 && temp <= 30)
        {
            System.out.println("Beautiful day");
        }
        else
        {
            System.out.println("Cold day");
        }
    }
}