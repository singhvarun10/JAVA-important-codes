/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicecode;

/**
 *
 * @author VARUN SINGH
 */
import java.util.*;
class Ticket{
    static int n1=8;
    public synchronized void book(String name, int seats){
        if(seats<=n1)
        System.out.println("Seats booked " + name + seats);
        n1=n1-seats;
    }
}
class Counter1 extends Thread{
    Ticket q;
    int n1;
    String s;
    public Counter1(Ticket q,String s,int n1){
        this.q=q;
        this.s=s;
        this.n1=n1;
        Thread t = new Thread();
        start();
    }
    public void run(){
        q.book(s, n1);
        try{
            Thread.sleep(500);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
class Counter2 extends Thread{
    Ticket q;
    String s;
    int n1;
    public Counter2(Ticket q,String s,int n1){
        this.q =q;
        this.s=s;
        this.n1=n1;
        start();
    }
    public void run(){
        q.book(s, n1);
        try{Thread.sleep(500);}catch(Exception e){System.out.println(e);}
    }
}
public class threads {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        Ticket q = new Ticket();
        Counter1 c1 = new Counter1(q,"varun",5);
        Counter2 c2 = new Counter2(q,"jayant",10);
    }
}
