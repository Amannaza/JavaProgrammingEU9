package day31_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {


        Offer offer1 = new Offer();
        //offer1.location = "VA";

        offer1.setInfo("VA", "Amazon", "SDET",
                98000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("California", "Sony Inc", "QA",
                120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("Floria", "Apple", "QE",
                125000, true, true, true, true);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CApitalOne", "SM",
                115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("VA", "Bank Of America", "BA",
                130000, true, true, true, true);

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);

        System.out.println("---------------------------------------------------------------------");

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFullTime);   //removes if yhe offers are not full time
        System.out.println(fullTimeOffers.size());


        ArrayList<Offer> localAreas = new ArrayList<>(Arrays.asList(myOffers));
        localAreas.removeIf(p -> !p.location.equals("VA"));

        System.out.println(localAreas.size());
        //CompanyName+salary from local offers
        for (Offer offers : localAreas) {

            System.out.println(offers.companyName+" : "+offers.salary );
        }

        ArrayList<Offer>offensiveBenefits=new ArrayList<>(Arrays.asList(myOffers));
        offensiveBenefits.removeIf(p->!p.hasBenefit);

        System.out.println(offensiveBenefits.size());



        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));
        sdetOffers.removeIf(p -> !p.jobtitle.equals("SDET"));

        System.out.println(sdetOffers.size());



        ArrayList<Offer> offersWith100k = new ArrayList<>(Arrays.asList(myOffers));
        offersWith100k.removeIf(p -> p.salary>100000);


    System.out.println(offersWith100k.size());






    }


}
/*
2. Create a class named MyOffers:

        2.1 Create 7 objects of Offer
        2.2 Create an array of Offers named myOffers and store all 7 objects of offers
        2.3 Create an ArrayList of Offer named fullTimeOffers and add all the offer objects.
        2.3.1 Write a program that can remove the offer objects that are not full-time
        2.4 Create an ArrayList of Offer named localOffers and add all the offer objects.
        2.4.1 Write a program that can remove all the offers that are not from local
        2.5 Create an ArrayList of Offer named offersWithBenefits and add all the offer objects.
        2.5.1 Write a program that can remove all the offers that does not have benefit and does not have PTO
        2.6 Create an ArrayList of Offer named sdetOffers and add all the offer objects.
        2.6.1 Write a program that can remove all the offers that are not for SDET
        2.7 Create an ArrayList of Offer named offersWith100K and add all the offer objects.
        2.7.1 Write a program that can remove all the offers that are offering less than 100K salary
*/
