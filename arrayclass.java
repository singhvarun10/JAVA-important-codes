package practicecode;
import java.util.*;  
 class Stud{  
  int rollno;  
  String name;  
  int age;  
  Stud(int rollno,String name,int age){  
   this.rollno=rollno;  
   this.name=name;  
   this.age=age;  
  }  
}
class arrayclass{  
 public static void main(String args[]){  
  //Creating user-defined class objects  
    Stud s1 = new Stud(101,"varun",100);
    Stud s2 = new Stud(102, "ravi", 101);
    ArrayList<Stud> al  = new ArrayList<Stud>();
    al.add(s1);
    al.add(s2);
    Iterator itr = al.iterator();
    while(itr.hasNext()){
        Stud st = (Stud)itr.next();
        System.out.println(st.rollno + st.name + st.age);
    }
 }  
}