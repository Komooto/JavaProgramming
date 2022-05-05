import java.util.Scanner;

public class PatientInformation {


    public static void main(String[] args) {

        /*
        Welcome to the patient portal!
Please enter your personal information
Enter your first name
Enter your last name
Enter your email
Enter your street
Enter your city
Enter your state
Enter your zip code
Enter your work phone number
Enter your personal phone number
Enter your age
Enter your height
Enter your weight
Are you married?
Patient personal information
Full name: May, James
Address: 7925 Jones Branch Dr, McLean, VA 22102
Contacts: work phone number - 7896542314, personal phone number - 2406542314, email: jamesmay@gmail.com
Age: 35
Height: 5.1
Weight: 173.2 pounds
Married?: true
         */

        Scanner scan = new Scanner(System.in);

        //System.out.println("Welcome to the patient portal!");
        //System.out.println("Please enter your personal information");

        //System.out.println("Enter your first name");
        String firstName = scan.next();

        //System.out.println("Enter your last name");
        String lastName = scan.next();

        //System.out.println("Enter your email");
        String email = scan.next();

        //System.out.println("Enter your street");
        String street = scan.next();

        //System.out.println("Enter your city");
        String city = scan.next();

        //System.out.println("Enter your state");
        String state = scan.next();



        //System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();

        //System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        //System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        //System.out.println("Enter your age");
        int age = scan.nextInt();

        //System.out.println("Enter your height");
        double height = scan.nextDouble();

        //System.out.println("Enter your weight");
        double weight = scan.nextDouble();

        //System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();

        //System.out.println("Patient personal information");
        String fullName = lastName + ", " + firstName;
        //System.out.println("Full name: " + fullName);

       String address = street + ", " + city + ", " + state + ", " + zipcode;
        //System.out.println("Address: " + address);

        String contacts =  "work phone number - " + workPhoneNumber + ", personal phone number - " + personalPhoneNumber + ", email: " + email;
        //System.out.println("Contacts: " + contacts);

        //System.out.println("Age: " + age);
        //System.out.println("Height: " + height);
        //System.out.println("Weight: " + weight + " pounds");
        //System.out.println("Married? " + isMarried);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(street);
        System.out.println(city);
        System.out.println(state);



    }






}
