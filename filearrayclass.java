/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;
import java.io.*;
import java.util.*;
/**
 *
 * @author VARUN SINGH
 */
class Studen implements Serializable {
    String name;
    int id;
    public Studen(String n,int i){
        this.name=n;
        this.id=i;
    }
    public String toString(){
        return name + " " + id;
    }
}
public class filearrayclass {
    public static void main(String[] args){
        Studen s1 = new Studen("varun",1);
        Studen s2 = new Studen("amit", 2);
        ArrayList<Studen> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        try{
            FileOutputStream fo = new FileOutputStream("D:\\abc.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(al);
            oo.flush();
            oo.close();
            FileInputStream fi = new FileInputStream("D:\\abc.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            ArrayList<Studen> ai = (ArrayList)oi.readObject();
            Iterator i = ai.iterator();
            while(i.hasNext()){
                Studen s = (Studen)i.next();
                System.out.println(s.name + " " + s.id);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
