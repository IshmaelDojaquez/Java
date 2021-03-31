package Classes;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;

class FormattingNumbers
{
    public static void main(String[] args)
    {
        // $1,234,567
        String result = NumberFormat.getCurrencyInstance().format(1234567.891); // method chaining
        System.out.println(result);

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(.1);
        System.out.println(result2);
    }
}