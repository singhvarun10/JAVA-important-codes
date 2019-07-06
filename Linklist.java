package practicecode;
import java.util.*;
class Node{
    int data;
    Node next;
    public Node(int d){
        data =  d;
        next = null;
    }
}
class LinkedList{
    Node head;
    public void add(Node node){
        if(head==null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next!=null){
                n=n.next;
            }
            n.next = node;
        }
    }
    public void addatfirst(Node node){
        node.next = head;
        head = node;
    }
    public void addatany(int index,Node node){
        if(index==0){
            addatfirst(node);
        }
        else{
            Node n = head;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }
    public void deleteatany(int index){
        if(index==0){
            head = head.next;
        }
        else{
            Node n = head;
            Node n1 = null;
            for(int i=0;i<index-1;i++){
                n=n.next;
            }
            n1 = n.next;
            n.next = n1.next;
        }
    }
    public void show(){
        Node n = head;
        while(n.next!=null){
            System.out.println(n.data);
            n=n.next;
        }
        System.out.println(n.data);
    }
}
public class Linklist{
    public static void main(String[] args){
        Node n1 = new Node(5);
        Node n2 = new Node(10);
        Node n3 = new Node(15);
        Node n4 = new Node(20);
        Node n5 = new Node(25);
        Node n6 = new Node(30);
        LinkedList al = new LinkedList();
        al.add(n1);
        al.add(n2);
        al.add(n3);
        al.addatfirst(n4);
        al.addatany(2, n5);
        al.addatany(0, n6);
        al.deleteatany(2);
        al.show();
    }
}