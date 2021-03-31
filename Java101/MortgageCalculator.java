package Classes;

import java.text.NumberFormat;
import java.util.Scanner;

class MortgageCalculator
{
    public static void main(String[] args)
    {
        //constants for percent and 12 months in a year
        final byte MONTHS_IN_YEAR = 12;
        final byte  PERCENT = 100;

        //Scanner to get all the inputs
        Scanner scanner = new Scanner(System.in);

        //Ask the principal and save value
        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        //Ask about annual interest rate and save value
        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        //Calculate the monthly interest rate
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        //Ask how many years they want the mortgage payment to span over
        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        //Calculate mortgage
        double mortgage = principal
                          * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                          / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Your Mortgage: " + mortgageFormatted);

    }
}