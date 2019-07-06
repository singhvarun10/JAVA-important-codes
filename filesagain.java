package practicecode;
import java.util.*;
import java.io.*;
class Stude implements Serializable{
    int id;
    String name;
    public Stude(int id,String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return id + " " + name;
    }
}
public class filesagain{
    public static void main(String[] args){
        try{
            Stude s1 = new Stude(1,"varun");
            Stude s2 = new Stude(2,"jayant");
            ArrayList<Stude> al = new ArrayList<>();
            al.add(s1);
            al.add(s2);
            Iterator ir = al.iterator();
            while(ir.hasNext()){
                Stude s = (Stude)ir.next();
                System.out.println(s.id + " " + s.name);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
}