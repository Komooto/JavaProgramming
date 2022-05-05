package day27_WrapperClass;

public class WrapperClassMethods {
    public static void main(String[] args) {

        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        String str = "123";
        int number = Integer.parseInt(str);
        String str1 = "10.2";
        double number2 = Double.parseDouble(str1);

        System.out.println(min);
        System.out.println(max);
        System.out.println(number + 2);
        System.out.println(number2 + 2);

        long minL = Long.MIN_VALUE;
        long maxL = Long.MAX_VALUE;

        System.out.println(minL);
        System.out.println(maxL);

        System.out.println("============================== 1 =============================");

        str = "123";

        Integer x = Integer.valueOf(str);
        Double y = Double.valueOf(str);

        System.out.println(x);
        System.out.println(y);

        char ch = 70;

        System.out.println(ch);

        System.out.println("=============================== 2 ==============================");

        char char1 = '!';

        boolean b1 = Character.isDigit(char1);
        boolean b2 = Character.isLetter(char1);
        boolean b3 = Character.isLetterOrDigit(char1);
        boolean b4 = !Character.isLetterOrDigit(char1);
        boolean b5 = Character.isUpperCase(char1);
        boolean b6 = Character.isLowerCase(char1);

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b4);
        System.out.println(b5);
        System.out.println(b6);

        System.out.println("=============================== 3 ==========================");

        String str3 = "AASD5SF6D5FDG2F3G1FD";
        int sum = 0;
        for (char each : str3.toCharArray()) {
            if (Character.isDigit(each)){
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println(sum);
    }
}
