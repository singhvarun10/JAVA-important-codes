//Write a Java program to find the number of even and odd integers in a given array of integers.
package codes;
import java.util.*;
public class Code{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int k=0,l=0;
        System.out.print("Enter the number of integers : ");
        int n1 = n.nextInt();
        int a[] = new int[200];
        System.out.println("Enter the integers : ");
        for(int i=0;i<n1;i++){
            a[i] = n.nextInt();
        }
        System.out.println(" ");
        System.out.println("Even integers : ");
        for(int i=0;i<n1;i++){
            if(a[i]%2==0){
                k++;
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("Odd integers : ");
        for(int i=0;i<n1;i++){
            if(a[i]%2!=0){
                l++;
                System.out.print(a[i]+ " ");
            }
        }
        System.out.println(" ");
        System.out.println("The number of even numbers are : "+k);
        System.out.println("The number of odd numbers are : "+l);
    }
}
