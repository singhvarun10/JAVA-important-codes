/*Write a program to demonstrate the knowledge of students in File handling. Eg., Define a class ‘Donor’ to store the below mentioned details of a blood donor.
Name, age, Address, Contact number, blood group, date of last donation
Create ‘n’ objects of this class for all the regular donors at Vellore. Write these objects to a file. Read these objects from the file and display only
those donors’ details whose blood group is ‘A+ve’ and had not donated for the recent six months.

*/
package javaapplication1;
import java.util.*;
import java.io.*;
class Donor implements Serializable{
    String name;
    int age;
    String address;
    int number;
    String blood;
    int day;
    int month;
    int year;
    int jay;
    public Donor(String n, int a,String add, int num, String b,int d,int mon,int y){
        this.name = n;
        this.age = a;
        this.address = add;
        this.number = num;
        this.blood = b;
        this.day = d;
        this.month = mon;
        this.year = y;
    }
    public String toString(){
        if(blood.equals("A+")){
            if(year<2019){
                if(month<9){
                    return "Name: " +name + ", Blood Group: " + blood + ", Date was: " + day + "/" + month + "/" + year + " ";
                }
            }
        }
        return null;
    }
}
public class JavaApplication1 {
    public static void main(String[] args) {
        Donor n1 = new Donor("David",25,"Vellore",85746985,"A+",15,7,2015);
        Donor n2 = new Donor("Varun",23,"Vellore",92864879,"A+",7,2,2019);
        Donor n3 = new Donor("Rahul",32,"Vellore",773746521,"B+",23,2,2017);
        Donor n4 = new Donor("Ajay",18,"Vellore",987465432,"O+",21,4,2016);
        try{
            FileOutputStream f = new FileOutputStream("C:\\Users\\16BEE0023\\Desktop\\blood.txt");
            ObjectOutputStream ob = new ObjectOutputStream(f);
            ob.writeObject(n1);
            ob.writeObject(n2);
            ob.writeObject(n3);
            ob.writeObject(n4);
            ob.close();
            f.close();
        }catch(Exception e){
            System.out.print(e);
        }
        try{
            Donor Object1;
            FileInputStream f1 = new FileInputStream("C:\\Users\\16BEE0023\\Desktop\\blood.txt");
            ObjectInputStream ob1 = new ObjectInputStream(f1);
            Object1 = (Donor)ob1.readObject();
            ob1.close();
            System.out.print(Object1);
        }catch(Exception e){
            System.out.print(e);
        }
    }
}
