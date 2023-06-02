package day09_IfStatements;

public class EligibleForVote {
    public static void main(String[] args) {
        int age =13;

        boolean isEligible=age>=18;

        if (isEligible){
            System.out.println("Goverment waiting for your vote");
        }
        else {
            System.out.println("Young For Vote");
        }




    }
}
