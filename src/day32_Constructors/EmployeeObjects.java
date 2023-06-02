package day32_Constructors;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1 = new Employee("Aaron");

        Employee employee2 = new Employee("Yulia", 'F');

        Employee employee3=new Employee("olga",'F',"SDET");

        Employee employee4=new Employee("");




        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(employee3);
        System.out.println(employee4);

    }
}
