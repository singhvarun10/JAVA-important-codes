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
public class file2 {
    public static void main(String[] args){
        try{
            FileInputStream f1 = new FileInputStream("D:\\hey.txt");
            FileInputStream f2 = new FileInputStream("D:\\tey.txt");
            FileOutputStream f3 = new FileOutputStream("D:\\add.txt");
            SequenceInputStream f= new SequenceInputStream(f1,f2);
            int i=0;
            while((i=f.read())!=-1){
                f3.write((char)i);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
