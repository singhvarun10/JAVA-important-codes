/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;
import java.io.*;

/**
 *
 * @author VARUN SINGH
 */
class Student implements Serializable{
    String name;
    int age;
    public Student(String s, int n){
        this.name = s;
        this.age = n;
    }
    public String toString(){
        return name + " " + age;
    }
}
public class serialfile {
    public static void main(String[] args){
        try{
            Student o = new Student("Ravi",101);
            FileOutputStream fo = new FileOutputStream("D:\\serial.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(o);
            oo.close();
            oo.flush();
            Student o2;
            FileInputStream fi = new FileInputStream("D:\\serial.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            o2 = (Student)oi.readObject();
            System.out.print(o2);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
