package jobsheet12;

public class StudentQueue26 {
    Node26 front, rear;
    int size;

    boolean isEmpty() {
        return front == null;
    }

    boolean isFull() {
        return false;
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Queue Cleared.");

    }

    void enqueue(Student26 student) {
        Node26 newNode = new Node26(student, null);
        if (isEmpty()) {
            front = rear = null;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");

        } else {
            System.out.println("calling to the next queue");
            front.data.print();
            front = front.next;
            size--;
            if (front == null)
                rear = null;

        }

    }

    void printFrontRear() {
        if (!isEmpty()) {
            System.out.println("Front: ");
            front.data.print();
            System.out.println("Rear:");
            rear.data.print();

        } else {
            System.out.println("Queue is empty");
        }
    }

    void printAll() {
        if (isEmpty()) {
            System.out.println("Queue is empty!");

        } else {
            System.out.println("Student in queue");
            Node26 temp = front;
            while (temp != null)
                ;
            temp.data.print();
            temp = temp.next;
        }
    }

    int total() {
        return size;
    }
}
