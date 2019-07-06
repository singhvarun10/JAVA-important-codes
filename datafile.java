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
public class datafile {
    public static void main(String[] args){
        try{
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        int n3 = n1+n2;
        Writer f= new FileWriter("D:\\final.txt");
        f.write(n3 + " ");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
