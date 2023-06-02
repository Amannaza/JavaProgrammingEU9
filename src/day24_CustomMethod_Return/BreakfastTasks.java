package day24_CustomMethod_Return;

public class BreakfastTasks {
    public static void main(String[] args) {

        initials("aman", "nurnazarov");

        System.out.println("-------------------");
        domainOfEmail("aman.nurnazarov.95@gmail.com");

        System.out.println("----------------------");
        String[] emails = {"josh@email.com", "jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com"};

        for (int i = 0; i < emails.length; i++) {
            domainOfEmail(emails[i]);
        }
/*
        for (email:
             emails) {
            domainOfEmail(emails[i]);
        }
*/

        System.out.println("----------------------");
        nameOfMonth(9);

        System.out.println("----------------------");
        dayOfWeek(5);

        System.out.println("----------------------");
        nameOfMonth(12);

        System.out.println("----------------------");
        ageGroup(12);

    }


    //        1. Create a method that can display the initials of the person.   initials(String firstName,String lastName)
    public static void initials(String firstName, String lastName) {
        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial=" + initial);
    }

    //        2. Create a method that can display the domain of the email
    public static void domainOfEmail(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //        3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth(int number) {
        String nameMonth = "";
        if (number >= 1 && number <= 12) {
            nameMonth = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June"
                    : (number == 7) ? "July" : (number == 8) ? "August" : (number == 9) ? "Semtember" : (number == 10) ? "October" : (number == 11) ? "November" : "December";
        } else {
            nameMonth.equals("Invalid");
        }
        System.out.println("nameMonth = " + nameMonth);    }

    //        4. Create a method that can print the name of the day based on the given number to the method

    public static void dayOfWeek(int num){

        String day=(num==1)?"Monday":(num==2)?"Thursday":(num==3)?"Thursday":(num==4)?"Wednesyday":(num==5)?"Friday"
                :(num==6)?"Saturday":"Sunday";
        System.out.println("day = " + day);
    }

    //        5. Create a method that can print how many days a month has

    public static void daysOfMonth(int numb){
        int numberOfMonth=(numb==2)?28:(numb==4||numb==6||numb==9||numb==1)?30:31;
        System.out.println("numberOfMonth = " + numberOfMonth);
    }

    //        6.Create a method that can print age groups

    public static void ageGroup(int age) {
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
    /*Warmup tasks:
        1. Create a method that can display the initials of the person

        2. Create a method that can display the domain of the email

        3. Create a method that can display the name of the month based on the given number to the method

        4. Create a method that can print the name of the day based on the given number to the method

        5. Create a method that can print how many days a month has

        6.Create a method that can print age groups
*/