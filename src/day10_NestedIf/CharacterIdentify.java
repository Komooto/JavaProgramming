package day10_NestedIf;

public class CharacterIdentify {

    public static void main(String[] args) {

        char ch = 65;

        if (ch >= '0' && ch <= '9'){
            System.out.println("Digit");
        }
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special character");
        }




    }
}
