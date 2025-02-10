package arrays;

import java.util.Arrays;

public class second_largest_number {
    public static void main(String[] args) {
        int[] numbers = {5,3,56,45,89,28};

        Arrays.sort((numbers));

        System.out.println(numbers[numbers.length - 2]);
    }
}
