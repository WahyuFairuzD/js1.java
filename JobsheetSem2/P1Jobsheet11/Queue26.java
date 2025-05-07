package JobsheetSem2.P1Jobsheet11;
public class Queue26 {
    int max, front, rear;
    int[] data;

    public Queue26(int n) {
        max = n;
        data = new int[max];
        front = rear = -1;
    }

    public boolean isEmpty() {
        return rear == -1;
    }

    public boolean isFull() {
        return rear == max - 1;
    }

    public void enqueue(int newData) {
        if (isFull()) {
            System.out.println("Queue is full!");
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                rear++;
            }
            data[rear] = newData;
            System.out.println("Data " + newData + " added to the queue.");
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
            return 0;
        } else {
            int out = data[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
            return out;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.print("Queue contents: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(data[i] + " ");
            }
            System.out.println();
        }
    }

    public void clear() {
        front = rear = -1;
        System.out.println("Queue has been cleared!");
    }
}