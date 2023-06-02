package day09_IfStatements;

public class AgeGroups {
    public static void main(String[] args) {
        /* Create a class called AgeGroups, and write a program that can define the age groups of a person age groups are:
                infant (1 - 2)
                Toddler (3 - 5),
                Kid (6 - 9),
                Pre-Teen (10 - 12),
                Teenager (13 - 17),
                Young Adult (18 - 20),
                Adult (21 - 39),
                Young Middle-Aged Adult (40 - 49),
                Middle-Aged Adult (50 - 54),
                Very Young Senior Citizen (55 - 64),
                Young Senior Citizen (65 - 74),
                Senior Citizen (75 - 84),
                Old Senior Citizen (85+)*/

        int age = 56;

        boolean infant = age == 1 || age == 2;
        boolean toddler = age >= 3 && age <= 5;
        boolean kid = age >= 6 && age <= 9;
        boolean preTeen = age >= 10 && age <= 12;
        boolean teeneger = age >= 13 && age <= 17;
        boolean youngAdult = age >= 18 && age <= 20;
        boolean adult = age >= 21 && age <= 39;
        boolean middle = age >= 40 && age <= 49;
        boolean middleAdult = age >= 50 && age <= 54;
        boolean veryYoungSenior = age >= 55 && age <= 64;
        boolean youngSenior = age >= 65 && age <= 74;
        boolean senior = age >= 75 && age <= 84;
        boolean oldSenior = age >= 85;

        if (infant) {
            System.out.println("Infant = " + age);
        } else if (toddler) {
            System.out.println("toddler = " + age);
        } else if (kid) {
            System.out.println("Kid = " + age);
        } else if (preTeen) {
            System.out.println("Pre-Teen = " + age);
        } else if (teeneger) {
            System.out.println("Teeneger = " + age);
        } else if (youngAdult) {
            System.out.println("Young Adult = " + age);
        } else if (adult) {
            System.out.println("Adult = " + age);
        } else if (middle) {
            System.out.println("Young Middle-Aged Adult = " + age);
        } else if (middleAdult) {
            System.out.println("Middle Aged Adult = " + age);
        } else if (veryYoungSenior) {
            System.out.println("Very Young Senior = " + age);
        } else if (youngSenior) {
            System.out.println("Young Senior = " + age);
        } else if (senior) {
            System.out.println("Senior citizen = " + age);
        } else if (oldSenior) {
            System.out.println("Old Senior Citizen = " + age);

        }

    }
}
