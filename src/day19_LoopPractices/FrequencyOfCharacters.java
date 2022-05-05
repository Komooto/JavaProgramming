package day19_LoopPractices;

import java.util.Scanner;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        String result = "";

        for (int j = 0; j < text.length(); j++) {


            char ch = text.charAt(j);
            int count = 0;

            for (int i = 0; i < text.length(); i++) {
                char each = text.charAt(i);

                if (ch == each) {

                    count++;
                }

            }
            if (result.contains("" + ch)){
                continue;
            }

            result += count;
            result += ch;
        }

        System.out.println(result);


    }
    }
