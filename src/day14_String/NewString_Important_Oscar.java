package day14_String;

public class NewString_Important_Oscar {

    public static void main(String[] args) {

        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        String str4 = new String("JAVA");

        System.out.println(str1 == str2 ); // true; Both str1 and str2 references are pointing the same object in the memory.
        System.out.println(str1 == str3 ); // false; str1 and str3 references are pointing the different objects in the memory.
        System.out.println(str1.equals(str3)); // true; equals() method is checking for the value of the object(not the object itself).
        System.out.println(str1.equalsIgnoreCase(str4)); //

        // Can we trim the space inside the text? - Yes!

        String str5 = "    My name is Muhammetjan";
        //System.out.println(str5.replaceAll(" ", ""));
        // or:
        System.out.println(str5.replace(" ", ""));
        System.out.println(str5.trim().substring(0));


    }
}
