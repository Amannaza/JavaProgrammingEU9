package day34_Garbage_Collection_AccesModifier;public class StaticMembers {    public static int num = 100;    public static void method() {    }    static {    }}class A {    //outer class    static class B {    //inner class        // Only inner class can be static        public static void method1() {        }    }}class C {    public static void main(String[] args) {        A.B.method1();    }}class X {}class Y {}class Z {    static class Q {    }}