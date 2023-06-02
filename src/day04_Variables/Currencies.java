package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        int dollar = 1000;

        double lira = dollar * 16.19;
        double euro = dollar * 1.07;
        //jpy,pound,peso,cad,riyal,rub...

        double jpy = dollar * 0.0079;
        double pound = dollar * 1.25;
        double peso = dollar * 0.050;
        double cad = dollar * 12.62;
        double riyal = dollar * 0.27;
        double rub = dollar * 0.018;


        System.out.println("dollar = " + dollar);
        System.out.println("euro = " + euro);
        System.out.println("lira = " + lira);
        System.out.println("jpy = " + jpy);
        System.out.println("pound = " + pound);
        System.out.println("peso = " + peso);
        System.out.println("cad = " + cad);
        System.out.println("riyal = " + riyal);
        System.out.println("rub = " + rub);



    }
}
