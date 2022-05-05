package day29_ArrayList_Continue;

import Utilites.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<>();
        number.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0));
        System.out.println(number);

        number.removeIf(each -> each %2 == 0);
        System.out.println(number);

        number.removeIf(p -> p %2  != 0);
        System.out.println(number);

        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");

        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Abdu","aba","Ifi","Cudu","Cdvdy","Dodo","uku","Alhilal","tuataut"));

        list.removeIf(name -> StringUtility.palindrome(name));

        System.out.println(list);









    }
}
