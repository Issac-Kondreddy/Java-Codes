package LinkedList.Circular_LinkedList;

public class Implementaion {
    public static void main(String[] args) {
        Circular_Linkedlist cll = new Circular_Linkedlist();
        cll.add(1);
        cll.add(2);
        cll.add(4);
        cll.add(5);
        cll.add(7);
        cll.add(8);
        cll.display();
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Circular_Linkedlist{
    Node head;
    public Circular_Linkedlist(){
        this.head = null;
    }

    public void add(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            newnode.next = head;
        }
        else{
            Node current = head;
            while(current.next!=head){
                current = current.next;
            }
            current.next = newnode;
            newnode.next = head;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No Elements");
        }
        else{
            Node current = head;
            System.out.print("Head ->");
            do{
                System.out.print(current.data + "->");
                current = current.next;

            }
            while(current!=head);
            System.out.print("(Head)");
        }
    }
}
