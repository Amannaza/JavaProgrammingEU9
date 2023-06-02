package day06_PrimitiveTypeCastings;

public class PrimitiveCasting {
    public static void main(String[] args) {

        byte a = 100;
        short b = a;
        //short b=(short)a
        //    short a

        int c = b; //İmplicit casting
        //int c=(int)b

        long d = c;
        /* long c */
        float e=d;
        double  f=e;
        System.out.println("----------------------");

        int x= 55;
        short y=(short)x;

        System.out.println(y+" : "+x);

        long j=1_000_000;
        short k=(short)j;  //Maximun rage of the short will be seen

        System.out.println(k+" : "+j);

        double l=2.5;
        float m=(float)l;

        System.out.println(m+" : "+l);

        double n=10.8;
        int o=(int)n;
        System.out.println(o+" : "+n);
        System.out.println("-----------------------");

        double d1=20.5;
        short s1= (short) d1;
        System.out.println(d1+ " : "+s1);

        float f1=30.5f;
        long l1= (long) f1;
        System.out.println(f1+" : "+l1);












    }
}
