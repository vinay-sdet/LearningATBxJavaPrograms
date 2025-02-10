package Tasks_9Feb;

import java.util.Scanner;

public class T3_left_triangle_star_pattern {
    public static void main(String[] args) {
        System.out.println("Enter a number - ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        // Left Triangle star pattern
        for (int i=n;i>=1;i--){
            for(int j =i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
