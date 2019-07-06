//Write a synchronization program for ticket booking process in theatre. Consider three counters for booking and have no_tickets has a common variable holding available tickets. When counter1 is using it others should not access to variable no_tickets.

package javaapplication1;
import java.util.*;
class Ticket{
    int seats = 8;
    synchronized void book(String name,int num){
        if(seats>=num && num>0){
            System.out.println(name + " " + num + " Booked");
            seats = seats - num;
        }
        else{
            System.out.println("Seats not available");
        }
    }
}
class Counterone extends Thread{
    Ticket q;
    String name;
    int seats;
    Counterone(Ticket q, String name,int seats){
        this.q = q;
        this.name = name;
        this.seats = seats;
        start();
    }
    public void run(){
        
        q.book(name,seats);
        try{Thread.sleep(500);}catch(Exception e){}
    }
}
class Countertwo extends Thread{
    Ticket q;
    String name;
    int seats;
    Countertwo(Ticket q, String name,int seats){
        this.q = q;
        this.name = name;
        this.seats = seats;
        start();
    }
    public void run(){
        
        q.book(name,seats);
        try{Thread.sleep(500);}catch(Exception e){}
    }
}
class Counterthree extends Thread{
    Ticket q;
    String name;
    int seats;
    Counterthree(Ticket q, String name,int seats){
        this.q = q;
        this.name = name;
        this.seats = seats;
        start();
    }
    public void run(){
        
        q.book(name,seats);
        try{Thread.sleep(500);}catch(Exception e){}
    }
}
public class Movie {
    public static void main(String[] args){
        Ticket n = new Ticket();
        Counterone th1 = new Counterone(n,"Varun",3);
        Countertwo th2 = new Countertwo(n,"Vinay",5);
        Counterthree th3 = new Counterthree(n,"Ajay",3);
    }
}
