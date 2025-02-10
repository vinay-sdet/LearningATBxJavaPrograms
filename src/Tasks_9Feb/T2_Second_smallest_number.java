package Tasks_9Feb;

import java.util.Arrays;

public class T2_Second_smallest_number {
    public static void main(String[] args) {
        int[] numbers = {5,3,56,45,89,28};

        //Sorting array using predefined function
        Arrays.sort((numbers));

        //Printing second smallest number.
        System.out.println(numbers[1]);

     }
}
