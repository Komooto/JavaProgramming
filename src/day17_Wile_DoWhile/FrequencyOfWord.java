package day17_Wile_DoWhile;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String str = "JavaJavaJavaJavaJavaJavaJavaJavaJava";
        String word = "Java";


        int frequency = 0;

        for (int i = 0; i < str.length() - word.length(); i++) {

            String eachSub = str.substring(i, i + word.length() );
           // System.out.println(eachSub);

            if (word.equals(eachSub)){
                frequency ++;
            }
        }

        System.out.println(frequency);




    }
}
