package day31_Constructors;

public class BankAccount {

    public String accountHolder;
    public long acoountNumber;
    public double balance;

    public void setInfo(String accountHolder,long acoountNumber ){
        this.accountHolder=accountHolder;
        this.acoountNumber=acoountNumber;
    }

    public String toString() {
        return "BankAccount{" +
                "accountHolder='" + accountHolder + '\'' +
                ", acoountNumber=" + acoountNumber +
                ", balance=$" + balance +
                '}';
    }

    public void checkBalance(){
        System.out.println("Your available balance is : $"+balance);
    }

    public void deposit(double amount){
        if (amount<=0){
            System.out.println("Depositing amount can't be negative or zero");
            return; //exits only the method
        }
        balance+=amount;
    }

    public void withdraw(double amount){
       if (amount>balance){ //if withdrawing balance is greater than available balance
           System.out.println("Unsufficient balance");
           return;
       }
       if (amount<=0){  //if witdrawing amount negative or zero
           System.out.println("Withdrawing amount can't be negative or zero");
           return;
       }
        balance-=amount;
    }

}
    /*BankAccount Task:
        Attributes:
        1. accountHolder, 2. accountNumber, 3. balance

        Actions:
        1. setInfo(): sets the accountHolder and accountNumber attributes
        2. toString()
        3. checkBalance():displays the available balance
        2. deposit(): increases the balance by the given amount
        3. withdraw(): decreases the balance by the given amount*/