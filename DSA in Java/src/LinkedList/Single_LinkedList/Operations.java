package LinkedList.Single_LinkedList;

public class Operations {
    public static void main(String[] args) {
        SLL ll = new SLL();
        ll.add(1);
        ll.add(2);
        ll.add(5);
        ll.add(546);
        ll.add(786);
        ll.display();
        System.out.println();
        ll.search(4);
        ll.search(546);
        ll.insertion_front(33);
        ll.display();
        System.out.println();
        ll.insertion_end(34);
        ll.display();
        System.out.println();
        ll.insertion_at_node(345,546);
        ll.display();
    }

}

class Single_Node{
    int data;
    Single_Node next;

    public Single_Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SLL {
    Single_Node head;

    public void add(int data) {
        Single_Node newnode = new Single_Node(data);
        if (head == null) {
            head = newnode;
        } else {
            Single_Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newnode;
        }
    }

    public void display() {
        if (head == null) {
            System.out.println("NO Elements");
        } else {
            Single_Node current = head;
            System.out.print("Head -> ");
            while (current != null) {
                System.out.print(current.data + " ->");
                current = current.next;
            }
            System.out.print(" null");
        }
    }

    public void search(int data) {
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.data == data) {
            System.out.println("Element found at head " + head.data);
        } else {
            Single_Node current = head;
            while (current != null) {
                if (current.data == data) {
                    System.out.println("Element found " + current.data);
                    return;
                }
                current = current.next;
            }
        }
        System.out.println("Element not found!!!");
    }

    public void insertion_front(int data) {
        Single_Node newnode = new Single_Node(data);
        newnode.next = head;
        head = newnode;
    }

    public void insertion_end(int data) {
        Single_Node newnode = new Single_Node(data);
        if (head == null) {
            newnode.next = head;
            head = newnode;
        }
        Single_Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newnode;
        newnode.next = null;
    }

    public void insertion_at_node(int data, int afterData) {
        Single_Node current = head;

        // Step 1: Traverse to find the node with afterData
        while (current != null && current.data != afterData) {
            current = current.next;
        }

        // Step 2: Check if the node was found
        if (current == null) {
            System.out.println("Node with data " + afterData + " not found.");
            return;
        }

        // Step 3: Insert the new node
        Single_Node newNode = new Single_Node(data);
        newNode.next = current.next;
        current.next = newNode;
    }
}

