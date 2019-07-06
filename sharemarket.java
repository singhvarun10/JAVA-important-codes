/*Mellon share owner services maintain the details of the share holders.
a) Maintain the personal details of the share holder.
b) Manipulate the users to buy and sell the shares.
c) Maintain the account balances after sell and buying the shares.
d) Issue the dividends yearly once.
Write a Java program to implement the problem stated above using classes and objects in Java
Expected output:
.Tran Id	Share holder name	Bank Acc No	Date	Share Sell Value	Shares buy Value	Dividend	Acc Bal
 	 	 	 	 	 	 	 
*/
Code :-
package codes;
import java.util.*;
import java.lang.*;
class Share{
    String name;
    int accnum;
    static int number;
    static int balance;
    int x;
    int y;
    int count;
    int id;
    public void setname(String n){
        name  = n;
    }
    public void setacc(int n){
        accnum  = n;
    }
    public void setnumber(int nu){
        number = nu;
    }
    public void setbalance(int b){
        balance = b;
    }
    public String getname(){
        return name;
    }
    public int getacc(){
        return accnum;
    }
    public int getnumber(){
        return number;
    }
    public int getbalance(){
        return balance;
    }
    public int sell(int x, String h){
        if(h.equals("mahindra")){
            if(x>number){
                System.out.println("No you cannot sell");
            }
            else{
                System.out.println("Amount invested : " + x*500);
                balance  = balance + x*500;
                number = number - x;
            }
        }
        else if(h.equals("tata")){
            if(x>number){
                System.out.println("No you cannot sell");
            }
            else{
                System.out.println("Amount invested : " + x*400);
                balance  = balance + x*400;
                number = number - x;
            }
        }
        else{
            if(x>number){
                System.out.println("No you cannot sell");
            }
            else{
                System.out.println("Amount invested : " + x*600);
                balance  = balance + x*600;
                number = number - x;
            }
        }
        return 0;
    }
    public int buy(int y, String j){
        if(j.equals("mahindra")){
            if(y*600>balance){
                System.out.println("No you cannot buy");
            } 
            else{
                System.out.println("Amount invested : " + y*600);
                balance = balance - y*600;
                number =  number + y;
            }
        }
        else if(j.equals("tata")){
            if(y*600>balance){
                System.out.println("No you cannot buy");
            } 
            else{
                System.out.println("Amount invested : " + y*500);
                balance = balance - y*500;
                number =  number + y;
            }
        }
        else{
            if(y*600>balance){
                System.out.println("No you cannot buy");
            } 
            else{
                System.out.println("Amount invested : " + y*700);
                balance = balance - y*700;
                number =  number + y;
            }
        }
       return 0;
    }
    public void date(){
        Date n= new Date();
        System.out.println(n.toString());
    }
    public void random(){
        Random rand = new Random();
        int n = rand.nextInt(4500) + 3500;
        System.out.println("Transaction ID : "+n);
    }
    public void transcript(){
        System.out.println("Balance : " + balance);
        System.out.println("Dividend : " + 0.25*balance);
        System.out.println("Updated Balance : " + (balance + balance*0.25));
        System.out.println("Number of shares remaining : " + number);
        System.out.println("Thanks for trading!");
    }
}
public class Codes{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int buy = 0,sell = 0;
        int n4=4,n6=4;
        int n10 = 4;
        Share g = new Share();
        System.out.print("Enter the name : ");
        String n1 = n.next();
        g.setname(n1);
        System.out.print("Enter the account number : ");
        int acc = n.nextInt();
        g.setacc(acc);
        System.out.print("Enter the number of shares : ");
        int n2 = n.nextInt();
        g.setnumber(n2);
        System.out.print("Enter the total balance : ");
        int n3 = n.nextInt();
        g.setbalance(n3);
        while(n4!=0){
            System.out.print("Do you wanna sell or buy, press 1 for buy and 2 for sell or any other stroke to exit : ");
            n4  = n.nextInt();
            if(n4 == 1){
                System.out.print("Enter the number of shares you wanna buy : ");
                int n5 = n.nextInt();
                System.out.print("Whose shares you wanna buy (mahindra, tata, maruti :");
                String share = n.next();
                buy = n5;
                g.buy(n5,share);
            }
            else if(n4==2){
                System.out.print("Enter the number of shares you wanna sell : ");
                int n7 = n.nextInt();
                System.out.print("Whose shares you wanna sell (mahindra, tata, maruti :");
                String share = n.next();
                sell = n7;
                g.sell(n7,share);
            }
            else{
                n4 = 0;
            }
        }
        System.out.print("Do you want a transcript ? Press 1 for yes and 2 for No: ");
        while(n10 !=0){
            int n9 = n.nextInt();
            if(n9 == 1){
                g.random();
                System.out.println("Name : " + n1);
                System.out.println("Account number : " + acc);
                System.out.println("Amount invested in buying the shares : " +buy*600);
                System.out.println("Amount invested in selling the shares : " +sell*500);
                g.transcript();
            }
            else if(n9==2){
                System.out.println("Thanks for trading!");
            }
            else{
                n10 = 0;
            }
        }
    }
}
