package day31_Constructor;

public class CapitalOne {
    public static void main(String[] args) {

        BankAccount account1 = new BankAccount();
        account1.setInfo("Muhemmet Ilham", 123456789);
        System.out.println(account1);
        account1.deposit(10000);
        System.out.println(account1);
        account1.withDraw(3600);
        System.out.println(account1);














    }
}
