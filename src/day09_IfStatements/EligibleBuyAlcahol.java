package day09_IfStatements;

public class EligibleBuyAlcahol {
    public static void main(String[] args) {
        int age = 19;

        boolean isEligible = age >= 18;

        if (isEligible) {
            System.out.println("Yes person can buy alcahol");
        } else {
            System.out.println("No it's illegal to buy alcahol");
        }


    }
}
