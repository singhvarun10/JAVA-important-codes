/*Hyundai car show room sells the cars in weekly basis. It has a sales module to perform the sale of a car. The functionality of the sales module are
a.	New sale order function performs the input activity like getting the details of car( Model, Color, Engine Type, Fuel Type, Price)
b.	Authorize function check the payment (Should be greater than 50 percent of unit price) made by the user and approves the sale order and calls the other function called order processing.
c.	Order processing function check the stock for availability of the car and prints the delivery order(format given below) or other wise it will prints the production order (format given below).
Delivery Order:
Owner Name	Car Model	Color	Fuel Type	Delivery date
Production Order:
Production branch Name	Showroom address	Car Model	Color	Engine type	Date of delivery
 
Write a Java program to implement the concept of constructors for the
problem stated above.
*/

package codes;
import java.util.*;
class Hyundai{
    String model;
    String color;
    String fuel;
    String name;
    int price;
    Hyundai(String m, String c, String f, String name, int price){
        this.model = m;
        this.color = c;
        this.fuel = f;
        this.name = name;
        this.price = price;
    }
    public void checkpayment(int n,int m){
        if(n>m){
            System.out.println("You are good to go");
        }
        else{
            System.out.println("Insufficent fund for the car");
        }
    }
    public void orderprocessing(int m){
        if(m==1){
            System.out.print("Name |  ");
            System.out.print(" Car model | ");
            System.out.print(" Color | ");
            System.out.print(" Fuel type | ");
            System.out.println(" Delivery Date  ");
            System.out.print(name + " |");
            System.out.print(" "+model + " |");
            System.out.print(color+ " | ");
            System.out.print(" "+ fuel+ " | ");
        }
        else{
            System.out.println("Sorry the order cannot be delivered now but is forwared to production department");
            System.out.println("Production details : ");
            System.out.print("    Production branch name     | ");
            System.out.print(" Showroom address | ");
            System.out.print(" Car model | ");
            System.out.print(" Color | ");
            System.out.print(" Engine type | ");
            System.out.println(" Date of delivery ");
            System.out.print("Hyundai Production limited, Delhi | ");
            System.out.print("Sector 54, Delhi  | ");
            System.out.print("    "+model+"   | ");
            System.out.print("   "+color+"   |");
            System.out.print("    "+fuel+"  |    ");
        }
    }
    public void date(){
        Date n = new Date();
        System.out.println(n.toString());
    }
}
public class Codes{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int num = 5,sum=5;
        int process = 0;
        System.out.print("Enter your name : ");
        String n1 = n.nextLine();
        System.out.print("Enter the model number (i10 / i20 / elantra / tucson) : ");
        String n2 = n.nextLine();
        System.out.print("Enter the color of the car (red / blue / white / black ) : ");
        String n3 = n.nextLine();
        System.out.print("Enter the engine type (Petrol or Diesel) : ");
        String n4 = n.nextLine();
        System.out.print("Enter the amount : ");
        int n5 = n.nextInt();
        int n6 = n5-(int)(0.5*n5);
        Hyundai g = new Hyundai(n2,n3,n4,n1,n5);
        String m1="i10";
        String m2="i20";
        String m3="elantra";
        String m4="tucson";
        String m5="red";
        String m6="blue";
        String m7="white";
        String m8="black";
        String m9="petrol";
        String m10="diesel";
        if(n2.equals(m1)) {
            g.checkpayment(n6,2500);
        } else if(n2.equals(m2)){
            g.checkpayment(n6,3500);
        }
        else if(n2.equals(m3)){
            g.checkpayment(n6,4500);
        }
        else{
            g.checkpayment(n6,5500);
        }
        while(num!=0){
            System.out.print("Do you want to confirm the order ? 1 for yes 0 for no : ");
            num = n.nextInt();
            if(num==1){
                if(n2.equals(m1)){
                    if(n3.equals(m5) || n3.equals(m6) ){
                        if(n4.equals(m9)){
                            g.orderprocessing(1);
                            g.date();
                            break;
                        }
                        else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                        }
                    }
                    else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                    }
                }
                else if(n2.equals(m2)){
                    if(n3.equals(m5) || n3.equals(m7) ){
                        if(n4.equals(m10)){
                            g.orderprocessing(1);
                            g.date();
                            break;
                        }
                        else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                        }
                    }
                    else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                    }
                }
                else if(n2.equals(m3)){
                    if(n3.equals(m6) || n3.equals(m8) ){
                        if(n4.equals(m9) || n4.equals(m10)){
                            g.orderprocessing(1);
                            g.date();
                            break;
                        }
                        else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                        }
                    }
                    else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                    }
                }
                else if(n2.equals(m4)){
                    if(n3.equals(m6) || n3.equals(m7) || n3.equals(m8) ){
                        if(n4.equals(m9) || n4.equals(m10)){
                            g.orderprocessing(1);
                            g.date();
                            break;
                        }
                        else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                        }
                    }
                    else{
                            g.orderprocessing(0);
                            g.date();
                            break;
                    }
                }
                else{
                    System.out.println("The model does not exist");
                }
            }
        }
    }
}
