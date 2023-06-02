package day32_Constructors;

public class Employee {

public String name;
public char gender;
public String jobTitle;
public double salary;

public int tel;


    public Employee(String name){
    this.name=name;
}

public Employee(String name,char gender){
    //Employee(name);//       cx vbcx vbcxv bnm,/.,m
    this(name);//this.name=name;
    this.gender=gender;
}

public Employee(String name,char gender,String jobTitle){
    this(name,gender);
    this.jobTitle=jobTitle;
}

public Employee(String name,char gender,String jobTitle,double salary){
    this(name,gender,jobTitle);
    this.salary=salary;
}



    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }

    public void isWorking(){

        System.out.println(name + " is working since 2020.");
    }


    /*
    public void method1(){
    System.out.println("Method 1")}

    public void method2(){
    method1();
    }
    */


}
