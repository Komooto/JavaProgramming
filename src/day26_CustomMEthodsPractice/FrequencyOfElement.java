package day26_CustomMEthodsPractice;

public class FrequencyOfElement {

    public static void main(String[] args) {
        int[] arrayInt = {1,2,3,4,5,1,1};
        int integer = 0;

        int frequency = frequencyOfElement(arrayInt, integer);
        System.out.println(frequency);
    }

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
            if (each == element){
                frequency ++;
            }
        }
        return frequency;
    }

}
