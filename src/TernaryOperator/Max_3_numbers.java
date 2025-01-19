package TernaryOperator;

import org.w3c.dom.ls.LSOutput;

public class Max_3_numbers {
    public static void main(String[] args) {
        int n1 = 20;
        int n2 = 15;
        int n3 = 21;
        int largest_number;

        largest_number = (n1 >= n2) ? ((n1 >= n3) ? n1: n3) : ((n2 >=n3) ?n2 :n3);
        System.out.println("Largest number : " + largest_number);





    }
}
