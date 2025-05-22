package JobsheetSem2.P1Jobsheet11.Assignment; 

public class KrsQueue {
    Krs[] data;
    int front, rear, size, max;
    int approvedCounts = 0;
    int totalEnqueued = 0;
 
    public KrsQueue() {
        max = 10;
        data = new Krs[max];
        size = 0;
        front = 0;
        rear = -1;
    }

    boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    void peek() {
        if (!isEmpty()) {
            System.out.println("Front data: ");
            data[front].print();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Rear data: ");
            data[rear].print();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }
        int i = front;
        while (i != rear) {
            data[i].print();
            i = (i + 1) % max;
        }
        data[i].print();
        System.out.println("Number of element: " + size);
    }

    void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("All data has been successfully removed.");
        } else {
            System.out.println("Queue is already empty!!!");
        }
    }

    void enqueue(Krs dt) {
        if (isFull()) {
            System.out.println("Queue is full.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = dt;
        size++;
        totalEnqueued++;
        System.out.printf("%s is successfully addded at index %d\n", dt.name, rear);
    }

    Krs dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return null;
        }
        Krs dt = data[front];

        System.out.println("Data of Students that has been processed: ");
        int dequeueCount = (size >= 2) ? 2 : 1;
        for (int i = 0; i < dequeueCount; i++) {
            front = (front + 1) % max;
            size--;
            approvedCounts++;
            data[front].print();
        }

        return dt;
    }

    void displayFirstTwoStudents() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        } else {
            System.out.println("First student: ");
            data[front].print();
            if (size > 1) {
                int secondIndex = (front + 1) % max;
                System.out.println("Second student: ");
                data[secondIndex].print();
            }
        }
    }

    void showStatistics() {
        System.out.println("Number of the students that joined: " + (totalEnqueued));
        System.out.println("Number of approved KRS: " + approvedCounts);
        System.out.println("Numbers of pending for approvals " + size);
    }
}