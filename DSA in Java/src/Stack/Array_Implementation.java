package Stack;

public class Array_Implementation {
    public static void main(String[] args) {
        stack st = new stack();
        System.out.println(st.isEmpty());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);
        st.push(10);
        System.out.println(st.size());
        System.out.println(st.peek());
        st.pop();
        st.pop();
        System.out.println(st.size());
        System.out.println(st.peek());
    }
}

class stack {
    static final int MAX = 1000;
    int top;
    int[] arr = new int[MAX];

    stack() {
        top = -1;
    }

    boolean isEmpty() {
        return top < 0;
    }

    boolean push(int item) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow!!!");
            return false;
        } else {
            arr[++top] = item;
            return true;
        }
    }

    int pop() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE; // Indicate error or empty stack
        }
        return arr[top--];
    }

    int peek() {
        if (top < 0) {
            System.out.println("Stack is Empty");
            return Integer.MIN_VALUE; // Indicate error or empty stack
        }
        return arr[top];
    }

    int size() {
        return top + 1;
    }
}
