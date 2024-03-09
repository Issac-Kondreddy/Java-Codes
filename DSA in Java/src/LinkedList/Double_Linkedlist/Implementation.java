package LinkedList.Double_Linkedlist;

public class Implementation {
    public static void main(String[] args) {
        Double_LinkedList dll = new Double_LinkedList();
        dll.add(1);
        dll.add(2);
        dll.add(3);
        dll.add(4);
        dll.add(5);
        dll.displayforward();
    }
}

class Node{
    int data;
    Node prev;
    Node next;

    Node( int data){
        this.prev = null;
        this.data = data;
        this.next = null;
    }
}

class Double_LinkedList{
    Node head;

    public Double_LinkedList(){
        this.head = null;
    }

    public void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
            newnode.prev = current;
        }
    }

    public void displayforward(){
        if(head==null){
            System.out.println("No Elements");
        }
        Node current = head;
        System.out.print("Head -> ");
        while(current!=null){
            System.out.print(current.data + "-> ");
            current = current.next;
        }
        System.out.print("null");
    }
}