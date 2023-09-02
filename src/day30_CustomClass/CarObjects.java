package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setInfo("Toyota", "Camry", "Blue", 2001, 25000);

        Car car2 = new Car();
        car2.setInfo("Mercedes", "X2", "Dark-Black", 2006, 20000);

        Car car3 = new Car();
        car3.setInfo("BMW", "IX6", "White", 2018, 800000);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        // Car[]cars={car1,car2,car3};We can add more car array or can't remove
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1, car2, car3));

        for (Car each : carsList) {
             System.out.println(each.brand + " : " + each.price);
        }

        System.out.println("----------------------------------------------------------");

        /*
        BMW:2005~2008
        Toyota:1995~2017
        */

        carsList.removeIf(p->p.brand.equals("BMW")&&p.year>=2005&&p.year<=2008);
        carsList.removeIf(p->p.brand.equals("Toyota")&&p.year>=1995&&p.year<=2003);


      System.out.println(carsList);

    }
}
