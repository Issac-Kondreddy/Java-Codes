package LinkedList.Single_LinkedList;

public class Implementation {
    public static void main(String[] args) {
        Single_LinkedList ll = new Single_LinkedList();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        ll.add(4);
        ll.add(5);
        ll.add(6);
        ll.display();
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

class Single_LinkedList{
    private Node head;

    public void add(int data){
        Node newnode = new Node(data);
        if(head==null){
            head = newnode;
        }
        else{
            Node current = head;
            while(current.next!=null){
                current = current.next;
            }
            current.next=newnode;
        }
    }

    public void display(){
        if(head==null){
            System.out.println("No Elements");
        }
        else{
            Node current = head;
            System.out.print("Head" + " ->");
            while(current!=null){
                System.out.print(current.data + "->");
                current = current.next;
            }
            System.out.print("tail");
        }
    }
}
