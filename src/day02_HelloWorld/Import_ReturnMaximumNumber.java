package day02_HelloWorld;

import day24_CustomMethod_Return.ReturnMaximumNumber;

import java.util.Arrays;

public class Import_ReturnMaximumNumber {

    public static void main(String[] args) {

        int[] input = {1,2,3,4,5,6,7,8,9,10};
        int max = ReturnMaximumNumber.max(input);
        System.out.println(max);

    }
}
