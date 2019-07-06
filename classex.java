/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;
import java.util.*;
/**
 *
 * @author VARUN SINGH
 */
abstract class Figure{
    abstract void area();
}
class Cube extends Figure{
    int l;
    public void area(){
        System.out.println(l*l);
    }
}
class Cuboid extends Figure{
    int l;
    public void area(){
        System.out.println(l*2);
    }
}
public class classex {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        int n1 = n.nextInt();
        Cube a = new Cube();
        a.area();
        Cuboid c = new Cuboid();
        c.area();
    }
}
