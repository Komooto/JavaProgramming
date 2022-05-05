package day31_Constructor;

public class BankAccount {
    public String accountInfo;
    public long accountNumber;
    public double balance;

    public void setInfo(String accountInfo, long accountNumber) {
        this.accountInfo = accountInfo;
        this.accountNumber = accountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountInfo='" + accountInfo + '\'' +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }

    public void balance(){
        System.out.println("Your account balance is " + balance);
    }

    public void checkBalance(){
        System.out.println("Your balanace is " + balance);
    }
    public void deposit(double amount){
        if (amount <= 0){
            System.err.println("Depositing amount can not be zero or negative!");
            return;
        }
        balance += amount;
    }
    public void withDraw(double amount){
        if (amount > balance){
            System.err.println("Insufficient amount");
            return;
        }
        if (amount <= 0){
            System.err.println("WithDrawing amount can not be zero or negative!");
            return;
        }
        balance -= amount;
    }



}
