import java.util.*;

class Queue {
    int front, back, size;
    int[] queue;
    Queue(int c) {
        front = 0;
        back = -1;
        size = c;
        queue = new int[size];
    }

    void enqueue(int data) {
        if (back == size - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++back] = data;
    }

    void dequeue() {
        if (front > back) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = 0; i < back; i++) {
            queue[i] = queue[i + 1];
        }
        back--;
    }

    void display() {
        if (front > back) {
            System.out.println("Queue is Empty");
            return;
        }
        for (int i = front; i <= back; i++) {
            System.out.print(queue[i] + " <-- ");
        }
        System.out.println();
    }

    void front() {
        if (back == -1) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.println("Front Element is: " + queue[front]);
    } }
    public class Q26{

    public static void main(String[] args) {
        
        Queue q = new Queue(4);
        q.display();
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.display();
        q.enqueue(60);
        q.display();
        q.dequeue();
        q.dequeue();
        System.out.println("After two node deletions");
        q.display();
        System.out.println("After one insertion");
        q.enqueue(60);
        q.display();
        q.front();
    }
}
