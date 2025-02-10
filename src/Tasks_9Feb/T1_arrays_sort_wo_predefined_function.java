package Tasks_9Feb;

public class T1_arrays_sort_wo_predefined_function {
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        int temp;

        for (int i =0; i< (numbers.length) -1; i++){
            for (int j =0; j< numbers.length -1;j++){
                if (numbers[j] > numbers[j + 1]) {
                    // Swappping numbers using a temp variable.
                    temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

    // Printing sorted array
        for (int num : numbers)
            System.out.println(num);

    }
}
