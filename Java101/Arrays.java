package Classes;

import java.util.Arrays;

class Array
{
    public static void main(String[] args)
    {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        int[] numbers2 = {2, 4, 3, 6, 5, 7};  //newer syntax for creating and inputting values in an array
        Arrays.sort(numbers2);  // will sort the array

        System.out.println(Arrays.toString(numbers));  //to see the actual values in the array you need Arrays.toString.
        System.out.println(Arrays.toString((numbers2)));
    }
}