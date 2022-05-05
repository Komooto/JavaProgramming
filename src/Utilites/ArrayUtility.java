package Utilites;

import java.util.Arrays;

public class ArrayUtility {

    // Print each integer of an integer Array in separate lines;
    public static void printEachElementElement(int[] Array){

        for (int each : Array) {
            System.out.println(each);
        }
    }
    public static void printEachElementElement(double[] Array){

        for (double each : Array) {
            System.out.println(each);
        }
    }
    public static void printEachElementElement(char[] Array){

        for (char each : Array) {
            System.out.println(each);
        }
    }
    public static void printEachElementElement(String[] Array){

        for (String each : Array) {
            System.out.println(each);
        }
    }
    // Find maximum number in an Array
    public static int max1(int[] array){
        int max = 0;
        for (int each : array) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }
    public static int max2(int[] array){
        Arrays.sort(array);
        return array[array.length - 1];
    }
    public static double max1(double[] array){
        double max = 0;
        for (double each : array) {
            if (each > max){
                max = each;
            }
        }
        return max;
    }
    public static double max2(double[] array){
        Arrays.sort(array);
        return array[array.length - 1];
    }
    // Find minimum number in an Array
    public static int min(int[] input){
        int min = input[0];
        for (int i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static double min(double[] input){
        double min = input[0];
        for (double i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static long min(long[] input){
        long min = input[0];
        for (long i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static short min(short[] input){
        short min = input[0];
        for (short i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static float min(float[] input){
        float min = input[0];
        for (float i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    public static byte min(byte[] input){
        byte min = input[0];
        for (byte i : input) {

            if (min > i){
                min = i;
            }
        }
        return min;
    }
    // Check out if an Array contain an element
    public static boolean contains(int[] array, int element){
        boolean contains = false;
        for (int each : array) {
            if (each == element){
                contains = true;
            }
        }
        return contains;
    }
    public static boolean contains(String[] array, String element){
        boolean contains = false;
        for (String each : array) {
            if (each.equals(element)){
                contains = true;
            }
        }
        return contains;
    }
    public static boolean contains(char[] array, char element){
        boolean contains = false;
        for (char each : array) {
            if (each == element){
                contains = true;
            }
        }
        return contains;
    }
    public static boolean contains(double[] array, double element){
        boolean contains = false;
        for (double each : array) {
            if (each == element){
                contains = true;
            }
        }
        return contains;
    }
    // Add an element to an Array
    public static String[] addElements(String[] array, String str){
        String[] newArray = new String[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static char[] addElements(char[] array, char str){
        char[] newArray = new char[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static int[] addElements(int[] array, int str){
        int[] newArray = new int[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    public static double[] addElements(double[] array, double str){
        double[] newArray = new double[array.length +1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = str;
        return newArray;

    }
    // Find frequency of an element from an Array
    public static int frequencyOfElement(int[] array, int element){
        int frequency = 0;
        for (int each : array) {
            if (each == element){
                frequency ++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(double[] array, double element){
        int frequency = 0;
        for (double each : array) {
            if (each == element){
                frequency ++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(char[] array, char element){
        int frequency = 0;
        for (char each : array) {
            if (each == element){
                frequency ++;
            }
        }
        return frequency;
    }
    public static int frequencyOfElement(String[] array, String element){
        int frequency = 0;
        for (String each : array) {
            if (each.equals(element)){
                frequency ++;
            }
        }
        return frequency;
    }
    // Find unique elements from an Array
    public static int[] uniqueElements(int[] array){

        int[] uniqueElements = {};
        for (int each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static double[] uniqueElements(double[] array){

        double[] uniqueElements = {};
        for (double each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static char[] uniqueElements(char[] array){

        char[] uniqueElements = {};
        for (char each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    public static String[] uniqueElements(String[] array){

        String[] uniqueElements = {};
        for (String each : array) {
            if (ArrayUtility.frequencyOfElement(array, each) == 1){
                uniqueElements = ArrayUtility.addElements(uniqueElements, each);
            }
        }
        return uniqueElements;
    }
    // Remove specific element from an Array
    public static int[] removeElements(int[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        int[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static int[] removeElements2(int[] array, int index) {
        int[] newArray = new int[array.length - 1];
        int j = 0;
        for (int each = 0; each < array.length; each++) {
            if (each == index) {
                continue;
            }
            newArray[j++] = each;
        }
        return newArray;
    }
    public static double[] removeElements(double[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        double[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static char[] removeElements(char[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        char[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    public static String[] removeElements(String[] array, int index) {
        if (index < 0 || index >= array.length) {
            System.err.println("Invalid index!");
            System.exit(0);
        }
        String[] newArray = {};
        for (int each = 0; each < array.length; each++) {
            if (each != index) {
                newArray = addElements(newArray, array[each]);
            }
        }
        return newArray;
    }
    // Merge 2 Arrays
    public static int[] merge(int[] array1, int[] array2){
        int[] newArray = {};
        for (int each : array1) {
            newArray = addElements(newArray,each);
        }
        for (int each : array2) {
            newArray = addElements(newArray, each);
        }
        return newArray;
    }
    public static double[] merge(double[] array1, double[] array2){
        double[] newArray = {};
        for (double each : array1) {
            newArray = addElements(newArray, each);
        }
        for (double each : array2) {
            newArray = addElements(newArray, each);
        }
        return newArray;
    }
    public static char[] merge(char[] array1, char[] array2){
        char[] newArray = {};
        for (char each : array1) {
            newArray = addElements(newArray, each);
        }
        for (char each : array2) {
            newArray = addElements(newArray, each);
        }
        return newArray;
    }
    public static String[] merge(String[] array1, String[] array2){
        String[] newArray = {};
        for (String each : array1) {
            newArray = addElements(newArray, each);
        }
        for (String each : array2) {
            newArray = addElements(newArray, each);
        }
        return newArray;
    }
    // Reverse an Array
    public static int[] reverse(int[] array){
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static double[] reverse(double[] array){
        double[] reversed = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static char[] reverse(char[] array){
        char[] reversed = new char[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    public static String[] reverse(String[] array){
        String[] reversed = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[array.length -1 -i] = array[i];
        }
        return reversed;
    }
    // Replace Old Element to New Element
    public static int[] replaceNewElement(int[] array, int index, int newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static double[] replaceNewElement(double[] array, int index, double newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static char[] replaceNewElement(char[] array, int index, char newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    public static String[] replaceNewElement(String[] array, int index, String newElement){
        if (index < 0 || index >= array.length){
            System.err.println("Invalid Index!");
            System.exit(0);
        }
        array[index] = newElement;
        return array;
    }
    // Remove Duplicate Elements From an Array
    public static int[] removeDuplicate(int[] array){
        int[] newArray ={};
        for (int each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static double[] removeDuplicate(double[] array){
        double[] newArray ={};
        for (double each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static char[] removeDuplicate(char[] array){
        char[] newArray ={};
        for (char each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    public static String[] removeDuplicate(String[] array){
        String[] newArray ={};
        for (String each : array) {
            if (!(ArrayUtility.contains(newArray, each))){
                newArray = ArrayUtility.addElements(newArray,each);
            }
        }
        return newArray;
    }
    // If the password is strong password or not
    public static boolean isStrongPassword(String password){
        boolean b1 = password.length() >= 8 && !password.contains(" ");
        boolean b2 = false;
        boolean b3 = false;
        boolean b4 = false;
        boolean b5 = false;

        char[] chars = password.toCharArray();
        for (char each : chars) {
            if (Character.isUpperCase(each)){
                b2 = true;
            } else if (Character.isLowerCase(each)){
                b3 = true;
            } else if (Character.isDigit(each)){
                b5 = true;
            }else {
                b4 = true;
            }
            if (b2 && b3 && b4 && b5){
                break;
            }
        }

        boolean isStrongPassword = b1 && b2 && b3 && b4 && b5;
        return isStrongPassword;
    }





}
