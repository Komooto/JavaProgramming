package day17_Wile_DoWhile;

public class FrequencyOfWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Java Java Java Java Java Java Java Java";
        int frequency = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            frequency++;
        }

        System.out.println(frequency);

        System.out.println("=============================================================");
         str = "Java Java Java Java Java Java Java Java Java Java";
         str = str.toLowerCase();
         frequency = 0;

        while (str.contains("java")){
            str = str.replace("java", "");
            frequency++;
        }

        System.out.println(frequency);

    }
}
