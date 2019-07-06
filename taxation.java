/*Write a JAVA program to perform the house tax bill processing. Design a class for taxation with parameters like houseno, streetname, address, areacode, taxationnumber, ownername and mobileno. Member functions as input, taxation_details to print all details.
 
Derive a subclass billprocess with relevant members, taxamount, invoiceno, dateofpymnt, taxyear, fineamount and cashiername. Have member functions for input, bill_print.
 
Dervie a subclass accounts with relevant members like noof transactions, totalfineamount, totaltaxcollected, noofcheques, datetotal. Member functions like input, accounts_processing, print_report.
 
Use the concepts of exception handling in all the levels. The concept of throw, throws and throw able must be depicted in the above program.
*/
package codes;
import java.util.*;
import java.lang.*;
class MyThrowable extends Throwable{
    public MyThrowable(String message){
        super(message);
    }
}
class Taxation{
    int hno;
    String sname;
    String add;
    int areacode;
    int taxno;
    String name;
    int num;
    public void taxentry(int h,String s,String a,int area,int t,String n,int no) throws MyThrowable{
        if(h<0 && area<0 && t<0 && no<0){
            throw new MyThrowable("This cannot be negative");
        }
        else{
            hno=h;
            sname = s;
            add=a;
            areacode = area;
            taxno = t;
            name = n;
            num = no;
        }
    }
    public void taxation_details(){
        System.out.print("House number : " + hno + " || ");
        System.out.print("Streetname : " + sname + " || ");
        System.out.print("Address : " + add + " || ");
        System.out.print("Area Code : " + areacode + " || ");
        System.out.print("Taxation number : " + taxno + " || ");
        System.out.print("Owner name : " + name + " || ");
        System.out.println("Mobile Number : " + num + " || ");
    }
}

class Billprocess extends Taxation{
    int tamount; 
    int invno;
    String dop;
    int taxyear;
    int fineamount;
    String cname;    
    public void billentry(int t,int i, String d, int ty, int f, String c) throws MyThrowable{
        if(t<0 && i<0 && ty<0 && f<0){
            throw new MyThrowable("These values cannot be negative");
        }
        else{
            
            tamount = t;
            invno = i;
            dop = d;
            taxyear = ty;
            fineamount = f;
            cname = c;
        }
    }
    public void bill_print(){
        System.out.print("Tax amount : " + tamount + " || ");
        System.out.print("Invoice number : " + invno + " || ");
        System.out.print("Date of Payment : " + dop + " || ");
        System.out.print("Tax year : " + taxyear + " || ");
        System.out.print("Fine amount : " + fineamount + " || ");
        System.out.print("Cashier name : " + cname + " || ");
    }
}

class Accounts extends Billprocess{
    int nooftransactions=0;
    int totalfineamount=0;
    int totaltaxcollected=0;
    int noofcheques=0;
    String[] date;
    public int not(int n){
        nooftransactions = n;
        return 0;
    }
    public int tfine(int[] a){
        for(int i=0;i<a.length;i++){
            totalfineamount = totalfineamount + a[i];
        }
        return 0;
    }
    public int ttax(int[] a ){
        for(int i=0;i<a.length;i++){
            totaltaxcollected = totaltaxcollected + a[i];
        }
        return 0;
    }
    public int noc(int n){
        noofcheques = n;
        return 0;
    }
    public void datetotal(String[] date){
        for(int i=0;i<date.length;i++){
            System.out.print(date[i] + " || ");
        }
    }
    public void accounts_processing(String[] a){
        System.out.println("Name of the people under processing are : ");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i] + " || ");
        }
        System.out.println();
    }
    public void print_report(){
        System.out.print("Number of Transactions : " + nooftransactions + " || ");
        System.out.print("Total fine amount : " + totalfineamount + " || ");
        System.out.print("Total tax collected : " + totaltaxcollected + " || ");
        System.out.print("Number of cheques : " + noofcheques + " || ");
        System.out.println("Total dates : ");
    }
}

public class Codes{
    public static void main(String[] args) throws MyThrowable {
        Scanner n = new Scanner(System.in);
        int w=6;
        Taxation t1 = new Taxation();
        Billprocess b1= new Billprocess();
        Taxation t2 = new Taxation();
        Billprocess b2= new Billprocess();
        Taxation t3 = new Taxation();
        Billprocess b3= new Billprocess();
        Taxation t4 = new Taxation();
        Billprocess b4= new Billprocess();
        Accounts a = new Accounts();
        t1.taxentry(34,"Gandhi Street","Vellore",632014,7856792,"Rohan",987567432);
        t2.taxentry(78,"Main Street","Vellore",632014,7545632,"Niket",773754628);
        t3.taxentry(92,"Green Street","Vellore",632014,7456325,"Varun",854621499);
        t4.taxentry(45,"Vellore Street","Vellore",632014,795648,"Arun",865423587);
        b1.billentry(5000,7823,"19/02/2019",2019,500,"Teja");
        b2.billentry(7000,7829,"26/01/2019",2019,700,"Teja");
        b3.billentry(9000,7833,"15/01/2019",2019,900,"Teja");
        b4.billentry(6000,7845,"15/03/2019",2019,600,"Teja");
        int[] fine = {b1.fineamount,b2.fineamount,b3.fineamount, b4.fineamount};
        int[] tax = {b1.tamount,b2.tamount,b3.tamount,b4.tamount};
        String[] date={b1.dop,b2.dop,b3.dop,b4.dop};
        String[] name = {t1.name,t2.name,t3.name,t4.name};
        a.not(4);
        a.noc(4);
        a.tfine(fine);
        a.ttax(tax);
        while(w!=0){
            System.out.println("Choose your choice");
            System.out.println("1. Individual Data");
            System.out.println("2. All Taxation Details");
            System.out.println("3. All Bill Entries");
            System.out.println("4. All Entry Names");
            System.out.println("5. Final Report");
            System.out.println("6. To Exit");
            System.out.print("Enter your response : ");
            int c1 = n.nextInt();
            if(c1==1){
                System.out.println("Whose data you wanna check ?");
                System.out.println("1. Rohan");
                System.out.println("2. Niket");
                System.out.println("3. Varun");
                System.out.println("4. Arun");
                System.out.print("Enter your response : ");
                int  c2 = n.nextInt();
                if(c2==1){
                    t1.taxation_details();
                    b1.bill_print();
                }
                else if(c2==2){
                    t2.taxation_details();
                    b2.bill_print();
                }
                else if(c2==3){
                    t3.taxation_details();
                    b3.bill_print();
                }
                else{
                    t4.taxation_details();
                    b4.bill_print();
                }
            }
            else if(c1==2){
                t1.taxation_details();
                t2.taxation_details();
                t3.taxation_details();
                t4.taxation_details();
            }
            else if(c1==3){
                b1.bill_print();
                b2.bill_print();
                b3.bill_print();
                b4.bill_print();
            }
            else if(c1==4){
                a.accounts_processing(name);
            }
            else if(c1==5){
                a.print_report();
                a.datetotal(date);
            }
            else{
                w=0;
            }
        }
        System.out.println("Thanks for using the taxation system");
    }
}
