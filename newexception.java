package practicecode;
import java.util.*;
class Newex extends Exception{
    Newex(String s){
        super(s);
    }
}
class Check{
    int n1;
    public Check(int n1){
        n1=n1;
        try{
            validate(n1);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    public void validate(int n1) throws Newex{
        if(n1>10){
            throw new Newex("not valid");
        }
        else{
            System.out.println("Yes");
        }
    }
}
public class newexception{
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int n1 =  n.nextInt();
        Check a = new Check(n1);
        
    }
}