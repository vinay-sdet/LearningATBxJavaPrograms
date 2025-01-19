package TernaryOperator;

public class Nested_Ternery {
    public static void main(String[] args) {

        int num = 9;

        String result = (num > 10) ?(num > 20? "G > 20" : "Between 10 and 20" ) : "Les than 10";

        System.out.println(result);
    }
}
