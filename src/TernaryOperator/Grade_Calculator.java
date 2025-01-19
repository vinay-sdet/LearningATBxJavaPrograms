package TernaryOperator;

public class Grade_Calculator {
    public static void main(String[] args) {

        String gradeNum_str = args[0];

        int grade_num = Integer.parseInt(gradeNum_str);

        String grade = grade_num >=90 && grade_num <=100 ? "Grade A" : (grade_num>=80 && grade_num < 90 ? "Grade B" : (grade_num >=70 && grade_num < 80 ? "Grade C" : (grade_num >=60 && grade_num < 70 ? "Grade D" : "Grade F")));

        System.out.println(grade);
    }
}
