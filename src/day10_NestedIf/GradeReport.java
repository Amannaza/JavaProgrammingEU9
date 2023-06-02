package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        int grade = 63;
        String result ;

        if (grade >= 0 && grade <= 100) {

            if (grade >= 90 && grade <= 100) {
                result = "Excellent";
            } else if (grade >= 80 && grade <= 90) {
                result = "Great";
            } else if (grade >= 70 && grade <= 80) {
                result = "Good";
            } else if (grade >= 60 && grade <= 70) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "İnvalid";
        }
        System.out.println("result = " + result);
    }
}
