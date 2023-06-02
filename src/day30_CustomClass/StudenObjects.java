package day30_CustomClass;

import java.util.ArrayList;

public class StudenObjects {

    public static void main(String[] args) {

        Student studen1 = new Student();
        studen1.setInfo("Aygun", 'F', 39, 2210, 'A');

        Student studen2 = new Student();
        studen2.setInfo("Hulya", 'F', 26, 2123, 'B');

        Student studen3 = new Student();
        studen3.setInfo("Elminur", 'M', 28, 5511, 'B');

        Student studen4 = new Student();
        studen4.setInfo("Ali", 'M', 28, 5511, 'A');

        Student studen5 = new Student();
        studen5.setInfo("Mert", 'M', 26, 2252, 'C');

        Student[] students = {studen1, studen2, studen3, studen4, studen5};

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("----------------------------------------------------------------------");

        ArrayList<Student>earlyBirds=new ArrayList<>();//grade: A
        ArrayList<Student>angryBirds=new ArrayList<>();

        for (Student student : students) {

            if (student.grade=='A'){
                earlyBirds.add(student);
            }else {
                angryBirds.add(student);
            }

        }

        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);
    }
}
