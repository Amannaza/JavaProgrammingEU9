package day10_NestedIf;

public class GradeReport2 {
    public static void main(String[] args) {
        int s = 12;
        String result;

        if (s >= 0 && s <= 100) {

            if (s >= 90 && s <= 100) {
                result = "Excellent";
            } else if (s >= 80 && s <= 90) {
                result = "Great";
            } else if (s >= 70 && s <= 80) {
                result = "Good";
            } else if (s >= 60 && s <= 70) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {
            result = "İnvalid";
        }
        System.out.println("result = " + result);

        System.out.println("-----------------------------------------------------");

        String result2;
        if (s >= 0 && s <= 100) {
            result2 = (s >= 90 && s <= 100) ? "Excellent" : (s >= 80 && s <= 90) ? "Great" : (s >= 70 && s <= 80) ? "Good"
                    : (s >= 60 && s <= 70) ? "Passed" : "Failed";
        } else {
            result2 = "İnvalid score";
        }
        System.out.println("Result = " + result2);

    }
}
