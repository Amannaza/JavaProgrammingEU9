package day34_Garbage_Collection_AccesModifier;public class CydeoStudent {    public String name;    public static String schoolName;    //if we have static variable that can be set   within one step , we can directly assign it with constructor     // public static String schoolName = "Cydeo School";    public CydeoStudent(String studentName) {        this.name = studentName;        //    schoolName = "Cydeo School";   ----->    }    static {//more than one step to initialize static block,should use block        schoolName = "Cydeo School"; //Execute only one time,cause of static block    }}class CydeoStudentObject {    public static void main(String[] args) {        CydeoStudent student1 = new CydeoStudent("Jimmy");        CydeoStudent student2 = new  CydeoStudent("Cathy");        System.out.println(student1.schoolName);        System.out.println(student2.schoolName);    }}