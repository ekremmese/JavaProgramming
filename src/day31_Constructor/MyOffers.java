package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        Offer offer2 = new Offer();
        Offer offer3 = new Offer();
        Offer offer4 = new Offer();
        Offer offer5 = new Offer();
        Offer offer6 = new Offer();
        Offer offer7 = new Offer();

        offer1.setInfo("UAE","Amazon", "SDET", 100000, true,false,true,true);

        offer2.setInfo("USA","Google", "Developer", 120000, false,true,true,false);

        offer3.setInfo("UK","YouTube", "QA Lead", 150000, false,false,false,true);

        offer4.setInfo("Turkey","CoFlow", "SDET", 80000, false,true,false,true);

        offer5.setInfo("Holland","Apple", "SDET", 95000, true,true,true,false);

        offer6.setInfo("Suudi Arabia","Kingdom", "ProductOwner", 500000, true,false,false,true);

        offer7.setInfo("Germany","Delivery Hero", "DevOps", 200000, true,true,true,false);

        Offer[] myOffers = {offer1,offer2,offer3,offer4,offer5,offer6,offer7};

        ArrayList<Offer> offers = new ArrayList<>(Arrays.asList(myOffers));

        //System.out.println(offers);

        System.out.println("----------------------------------");

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(offers);
        fullTimeOffers.removeIf(p -> !p.isFullTime);  // removes the offers which are not full time

        System.out.println(fullTimeOffers.size());

        System.out.println("----------------------------------");

        ArrayList<Offer> localOffers = new ArrayList<>(offers);

        localOffers.removeIf(p-> !p.location.equals("Turkey"));

        System.out.println(localOffers);

        System.out.println("----------------------------------");

        ArrayList<Offer> offersWithBenefit = new ArrayList<>(offers);

        offersWithBenefit.removeIf(p-> !p.hasBenefit);

        System.out.println(offersWithBenefit);

        System.out.println("----------------------------------");

        ArrayList<Offer> sdetOffers = new ArrayList<>(offers);

        sdetOffers.removeIf(p-> !p.jobTitle.equals("SDET"));

        System.out.println(sdetOffers);

        System.out.println("----------------------------------");

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));

        offersWith100K.removeIf( p -> p.salary<100000 );

        System.out.println(offersWith100K);

        for ( Offer each : offersWith100K){
            System.out.println(each.companyName + " : " + each.salary);
        }

    }

}

// 35:22
