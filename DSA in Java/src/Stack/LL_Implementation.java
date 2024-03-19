package Stack;

public class LL_Implementation {
    public static void main(String[] args) {

    Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        if (stack.isEmpty()) {
            System.out.println("Stack is empty now.");
        }
    }
}
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack{
    Node top;
    Stack(){
        this.top = null;
    }

    boolean isEmpty(){
        if(top==null){
            return true;
        }
        return false;
    }

    public void push(int data){
        Node newnode = new Node(data);
        if(top==null){
            top = newnode;
        }
        else{
            newnode.next = top;
            top = newnode;
        }
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty!!");
            return -1;
        }
        else{
            int data = top.data;
            top = top.next;
            return data;
        }
    }

    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return -1;
        }
        else{
            return top.data;
        }
    }

}
