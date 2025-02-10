package arrays;

public class min_max {
    public static void main(String[] args) {
        int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        int max_output = max_array(array);
        System.out.println(max_output);

        int min_output = min_array(array);
        System.out.println(min_output);

    }
    static int max_array(int[] array){
    int max = array[0];
    for (int i=1; i< array.length;i++){
        if (array[i] > max){
            max = array[i];
        }
    }
    return max;
    }

    static int min_array(int[] array){
        int min = array[0];
        for (int i=1; i< array.length;i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }

}



