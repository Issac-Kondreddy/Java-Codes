package Queue;


public class Array_Queue {
    private final int[] queue;
    private int front;
    private int rear;
    private final int capacity;

    // Constructor to initialize the queue
    public Array_Queue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = -1;
        rear = -1;
    }

    // Method to add an element to the queue
    public void enqueue(int element) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot insert " + element);
            return;
        }
        // If the queue is empty, point front and rear to the first index
        if (front == -1) {
            front = 0;
        }
        queue[++rear] = element;
        System.out.println(element + " enqueued to queue");
    }

    // Method to remove an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue");
            return Integer.MIN_VALUE;
        }
        int element = queue[front];
        if (front >= rear) {
            front = -1; // Resetting the queue if it's now empty
            rear = -1;
        } else {
            front++;
        }
        System.out.println(element + " dequeued from queue");
        return element;
    }

    // Utility method to check if the queue is empty
    public boolean isEmpty() {
        return front == -1;
    }

    // Utility method to check if the queue is full
    public boolean isFull() {
        return rear == capacity - 1;
    }

    // Optional: Method to peek at the front of the queue without removing it
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        return queue[front];
    }

    public static void main(String[] args) {
        Array_Queue queue = new Array_Queue(5);

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);

        System.out.println("Front element is: " + queue.peek());

        queue.dequeue();
        queue.dequeue();
        queue.dequeue();


        queue.enqueue(6);
    }
}
