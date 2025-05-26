package Jobsheet13.Assignment;

public class Node {
    Student26 data;
    Node prev;
    Node next;

    Node() {
    }

    Node(Student26 data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }

    Node(Node prev, Student26 data, Node next) {
        this.data = data;
        this.prev = prev;
        this.next = next;
    }
}
