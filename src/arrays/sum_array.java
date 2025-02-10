package arrays;

public class sum_array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        int sum = 0;
        for (int i=0; i<numbers.length; i++){

            sum = sum + numbers[i];
        }
        System.out.println(sum);


        int sum_new = 0;
        for (int n: numbers){ // for each loop

            sum_new = sum_new + n;
        }
        System.out.println(sum_new);

    }
}
