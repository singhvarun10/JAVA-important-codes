//Write a Java program to find the common elements between two arrays (string values).
 
package codes;
import java.util.*;
public class Code{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        int n2 = n.nextInt();
        String a[]  =new String[200];
        String b[]  =new String[200];
        String c[]  =new String[200];
        System.out.println("Enter the elements from the first String : ");
        for(int i=0;i<n1;i++){
            a[i] = n.next();
        }
        System.out.println("Enter the elements from the Second String : ");
        for(int i=0;i<n2;i++){
            b[i] = n.next();
        }
        System.out.println(" ");
        System.out.println("Common elements are : ");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(a[i].compareTo(b[j])==0){
                    System.out.println(b[j]);
                }
            }
        }
    }
}
