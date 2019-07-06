//Write a Java program to segregate all 0s on left side and all 1s on right side of a given array of 0s and 1s.

package codes;
import java.util.Scanner;
public class Codes{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int k=0,l=0;
        int n1 = n.nextInt();
        int a[] = new int[200];
        int b[] = new int[200];
        int c[] = new int[200];
        int d[] = new int[200];
        for(int i=0;i<n1;i++){
            a[i] = n.nextInt();
        }
        System.out.println("Array Inserted : ");
        for(int i=0;i<n1;i++){
            System.out.print(a[i] + " ");
        }
        for(int i=0;i<n1;i++){
            if(a[i]==0){
                k++;
            }
        }
        for(int j=0;j<n1;j++){
            if(a[j]!=0){
                l++;
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<k;j++){
                if(a[i]==0){
                    b[j] = a[i];
                }
            }
        }
        for(int i=0;i<n1;i++){
            for(int j=0;j<l;j++){
                if(a[i]!=0){
                    c[j] = a[i];
                }
            }
        }
        for(int i=0;i<k;i++){
            d[i] = b[i];
        }
        for(int i=0;i<l;i++){
            for(int j=k;j<n1;j++){
                d[j] = c[i]; 
            }
        }
        System.out.println(" ");
        System.out.println("Array Arranged : ");
        for(int i=0;i<n1;i++){
            System.out.print(d[i] + " ");
        }
    }
}
