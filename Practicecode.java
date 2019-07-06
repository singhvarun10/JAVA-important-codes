/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;
import java.util.*;
import java.io.*;
/**
 *
 * @author VARUN SINGH
 */
public class Practicecode {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
           FileOutputStream f1 = new FileOutputStream("D:\\tey.text");
           Scanner n = new Scanner(System.in);
           String s = n.nextLine();
           byte[] b = s.getBytes();
           f1.write(b);
           FileInputStream f2 = new FileInputStream("D:\\tey.text");
           int i=0;
           while((i=f2.read())!=-1){
               System.out.print((char)i);
           }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
