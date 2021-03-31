package Classes;

class SwitchStatements
{
    public static void main(String[] args)
    {
        String role = "admin";
        switch(role)  //can use anything other then long type
        {
            case "admin":
                System.out.println("You are an admin.");
                break;
            case "moderator":
                System.out.println("You are a moderator.");
                break;
            default :  // default is if no other case works
                System.out.println("You are a guest.");
        }
    }
}