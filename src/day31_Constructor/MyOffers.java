package day31_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("Sultanmurat", "Cydeo", "SDET", 22500, true, true, true, true );

        Offer offer2 = new Offer();
        offer2.setInfo("Findikzade", "Cybertek", "SDET", 18750, false, true, false, true );

        Offer offer3 = new Offer();
        offer3.setInfo("Zeytinburnu", "Palavan", "SDET", 8500, true, false, true, false );

        Offer offer4 = new Offer();
        offer4.setInfo("Cevizlibag", "Google", "SDET", 29800, true, false, true, true );

        Offer offer5 = new Offer();
        offer5.setInfo("Capa", "Samsun", "SDET", 32210, false, true, true, false );

        System.out.println(offer1);
        System.out.println(offer2);
        System.out.println(offer3);
        System.out.println(offer4);
        System.out.println(offer5);
        System.out.println("========================================================================================");
        Offer[] offers = {offer1, offer2, offer3, offer4, offer5};
        ArrayList<Offer> offerArrayList = new ArrayList<>(Arrays.asList(offers));

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(offerArrayList);

        fullTimeOffers.removeIf(p -> !p.isFullTime);
        System.out.println("Full time offers are: " + fullTimeOffers);
        System.out.println(fullTimeOffers.size());





    }
}
