package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourly rate,weekly rate
        int hourslyRate = 65;
        int weeklyhours = 45;
        int numberOfWeeks = 52;
        int salary = hourslyRate * weeklyhours * numberOfWeeks;

        //System.out.print(salary)
        System.out.println("weeklyhours = $" + weeklyhours);
        System.out.println("hourslyRate = " + hourslyRate);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }
}
