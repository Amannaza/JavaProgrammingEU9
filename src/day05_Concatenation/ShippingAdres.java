package day05_Concatenation;

import static java.lang.System.*;

public class ShippingAdres {
    public static void main(String[] args) {

     /*  String name = "James King";
        String buildınNumber = "118BA";
        String streetname = "Jones Branch Dr";
        String city = "Mc Clean";
        String state = "VA";
        String zipCode = "22031A";
      */

        String name = "James King",
                buildınNumber = "118BA",
                streetname = "Jones Branch Dr",
                city = "Mc Clean",
                state = "VA",
                zipCode = "22031A";

        //System.out.println(name+"\n"+buildınNumber+" "+streetname+"\n"+city+", "+state+" "+zipCode);
        String adress = name + "\n" + buildınNumber + " " + streetname + "\n" + city + ", " + state + " " + zipCode;
        System.out.println(adress);

    }

}
