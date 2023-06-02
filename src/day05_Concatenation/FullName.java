package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String first_name = "Gurbanguly";
        String last_name = "Berdimuhammedow";
        int age = 64;
        String jobTitle = "President";
        String companyName = "Turkmenistan";
        int salary=1000000;


        String fullname = first_name + " " + last_name;
        /* Full name of person is.... */
        System.out.println("Full name of person is " + fullname);
        /* ...is... yerars old */
        System.out.println(fullname + " is " + age + " years old.");
        //Full name is jobtitle + , works at Company name
        System.out.println(fullname+"  is "+jobTitle+", works at "+companyName);
        //Fullname is jobtitle,works at companyName,and slary is salary

        System.out.println(fullname+" is "+ jobTitle+" , works at "+companyName+" , and salary is "+salary+" .");


    }
}
