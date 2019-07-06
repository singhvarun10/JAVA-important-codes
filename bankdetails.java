/*Create a class account that maintains acc_no, name, and balance. Perform deposit, withdrawal and statement print operations. 
Use subclasses loan account and credit card and use variables and function related to it. 
The class must be able to throw a INSUFFICIENT FUND exception when a user is trying to withdraw a amount less the minimum balance
*/
package codes;
import java.util.*;
class Account{
    int accnum;
    String name;
    static int balance;
    public void data(int acc, String n, int bal){
        this.accnum = acc;
        this.name = n;
        this.balance = bal;
    }
    public int withdraw(int x){
        try{
            balance = balance - x;
            if(balance<0){
                int z=balance/0;
            }
            else{
                System.out.println(balance);
            }
        }
        catch(Exception e){
                System.out.println("Insufficient fund");
                System.out.println("You should apply for the loan");  
        }
        return 0;
    }
    public int deposit(int x){
        balance = balance + x;
        return 0;
    }
    public void statement(){
        System.out.println("Name ; " + name);
        System.out.println("Account number : " + accnum);
        System.out.println("Balance : " + balance);
    }
}
class Loan extends Account{
    public void loan(int x){
        System.out.println("Your loan " + x);
        System.out.println("Your deduction per " + x*0.1);
    }
}
class Creditcard extends Account{
    public int creditwithdraw(int x){
        try{
            balance = balance - x;
            if(balance<0){
                int z=balance/0;
            }
            else{
                System.out.println(balance);
            }
        }
        catch(Exception e){
                System.out.println("Insufficient fund");
                System.out.println("You should apply for the loan");  
        }
        return 0;
    }
}
public class Codes{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num=5;
        Account m = new Account();
        Loan l = new Loan();
        Creditcard c = new Creditcard();
        System.out.print("Enter the account number : ");
        int n1 = n.nextInt();
        System.out.print("Enter your name : ");
        String n2 = n.next();
        System.out.print("Enter your balance : ");
        int n3 = n.nextInt();
        m.data(n1,n2,n3);
        while(num!=0){
            System.out.println("What do you wanna do with your account? (Deposit/ Withdrwa)");
            System.out.print("Press 1 for deposit, 2 for withdraw or any other for exiting : ");
            num = n.nextInt();
            if(num==1){
                System.out.print("How much money do you wanna deposit : ");
                int d = n.nextInt();
                m.deposit(d);
            }
            else if(num==2){
                System.out.println("How much money do you wanna withdraw");
                int d = n.nextInt();
                System.out.println("Medium of withdrawing card or account ? : ");
                String f = n.next();
                if(f.equals("card")){
                    if(d>n3){
                        c.creditwithdraw(n3);
                        System.out.println("How much loan do you wanna take : ");
                        int g= n.nextInt();
                        l.loan(g);
                    }
                    else{
                        c.creditwithdraw(n3);
                    }
                }
                else{
                    if(d>n3){
                        m.withdraw(n3);
                        System.out.println("How much loan do you wanna take : ");
                        int g= n.nextInt();
                        l.loan(g);
                    }
                    else{
                        m.withdraw(n3);
                    }
                }
            }
        }
        System.out.println("Here is your statement : ");
        m.statement();
    }
}
