package LinearStructure;

public class LinearQueue {
    private int[] numbers;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public LinearQueue(int capacity) {
        this.capacity = capacity;
        this.numbers = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
            return;
        }
        rear++;
        numbers[rear] = item;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; 
        }
        int item = numbers[front];
        front++;
        size--;
        return item;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; 
        }
        return numbers[front];
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        queue.display();

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());

        queue.display();

        queue.enqueue(4);
        queue.enqueue(5);

        queue.display();
    }
}
