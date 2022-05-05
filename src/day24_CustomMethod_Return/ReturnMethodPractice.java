package day24_CustomMethod_Return;

public class ReturnMethodPractice {

    public static void main(String[] args) {

        System.out.println(maxNumber(1, 2));
    }

    public static int maxNumber(int num1, int num2){
        int maxNumber = 0;

        if (num1 > num2) {
                    maxNumber = num1;
                } else {
                    maxNumber = num2;
                }
        return maxNumber;
    }









}
