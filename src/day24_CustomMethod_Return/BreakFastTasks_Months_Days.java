package day24_CustomMethod_Return;

public class BreakFastTasks_Months_Days {

    public static void main(String[] args) {

        System.out.println("========================= Initials of a Name =============================");
        initials("Muhemmetjan","Ilham");
        System.out.println("========================= Email Domain =============================");
        String[] emails = {"muhemmetjan@yahoo.com", "muhemmetjan@google.com", "muhemmetjan@amazon.com", "muhemmetjan@spacex.com", "muhemmetjan@cydeo.com"};
        for (String email : emails) {
            domain(email);
        }
        System.out.println("========================= Name of Month =============================");
        nameOfMonth(12);

        System.out.println("========================= Days of a Month =============================");
        daysOfTheMonth(1300, 2);

    }



    public static void initials(String firstName, String lastName){

        System.out.println("Initials: " + firstName.charAt(0) + "." + lastName.charAt(0) );
    }

    public static void domain(String email){

        System.out.println("email = " + email.substring(email.indexOf('@') +1, email.lastIndexOf('.')));
    }

    public static void nameOfMonth(int month){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};

        if (month >=1 && month <= 12) {
            String nameOfMonth = months[month -1];
            System.out.println("month = " + nameOfMonth);
        }else{
            System.err.println("Invalid!");
        }
    }

    public static void daysOfTheMonth(int year, int month){
        String[] months = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        int[] daysNormal = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int[] daysLeap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
       if (year % 4 == 0){
           if (month >=1 && month <= 12) {
               String nameOfMonth = months[month -1];
               int numberOfDays = daysLeap[month -1];
               System.out.println(year + " " + nameOfMonth + " has " + numberOfDays + " days.");
           }else{
               System.err.println("Invalid!");
           }
       }else {
           if (month >= 1 && month <= 12) {
               String nameOfMonth = months[month - 1];
               int numberOfDays = daysNormal[month - 1];
               System.out.println(year + " " + nameOfMonth + " has " + numberOfDays + " days.");
           } else {
               System.err.println("Invalid!");
           }
       }
    }
}
