package Classes;

import java.util.Arrays;

class MultiDimensionalArrays
{
    public static void main(String[] args)
    {
        int[][] numbers = new int[2][3];  // 2 rows and 3 columns
        numbers[0][0] = 1;

        int[][] numbers2 = { {1, 2, 3}, {4, 5, 6} };   // {} syntax for declaring multidimensional arrays
        System.out.println(Arrays.deepToString(numbers));  // used to print multi-dimensional arrays
        System.out.println(Arrays.deepToString(numbers2));

    }
}