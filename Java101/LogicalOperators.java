package Classes;

class LogicalOperators
{
    public static void main(String[] args)
    {
        // &&, ||, !
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasGoodCredit || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isWarm);
        System.out.println(isEligible);
    }
}