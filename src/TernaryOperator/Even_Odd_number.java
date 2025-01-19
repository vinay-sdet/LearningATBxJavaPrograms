package TernaryOperator;

public class Even_Odd_number {
    public static void main(String[] args) {
        String num_str = args[0];
        int num = Integer.parseInt(num_str);

        String result = (num%2 == 0) ? "Even" : "Odd";

        System.out.println(result);
    }
}
