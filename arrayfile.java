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
public class arrayfile {
    public static void main(String[] args){
        try{
            ArrayList<String> al = new ArrayList<>();
            al.add("varun");
            al.add("ravi");
            FileOutputStream f1 = new FileOutputStream("D:\\filearray.txt");
            ObjectOutputStream o1 = new ObjectOutputStream(f1);
            o1.writeObject(al);
            FileInputStream f2 = new FileInputStream("D:\\filearray.txt");
            ObjectInputStream o2 = new ObjectInputStream(f2);
            ArrayList am = (ArrayList)o2.readObject();
            System.out.println(am);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
