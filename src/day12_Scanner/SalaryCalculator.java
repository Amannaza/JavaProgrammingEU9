package day12_Scanner;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your hourly rate:");
        int hourlyRate = input.nextInt();

        System.out.println("How many hours do you work weekly:");
        int hourWeekly = input.nextInt();

        System.out.println("Enter State Rate:");
        double stateRate = input.nextDouble();

        System.out.println("Enter Federal Tax:");
        double federalTax = input.nextDouble();
        input.close();

        int salary = hourlyRate * hourWeekly * 4;
        double totalTax = stateRate + federalTax;
        double netIncome = salary - (salary * totalTax);

        System.out.println("Salary = " + salary);
        System.out.println("StateRate = " + stateRate);
        System.out.println("FederalTax = " + federalTax);
        System.out.println("TotalTax = " + totalTax);
        System.out.println("Net Income = " + netIncome);


    }
}
/*SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome*/