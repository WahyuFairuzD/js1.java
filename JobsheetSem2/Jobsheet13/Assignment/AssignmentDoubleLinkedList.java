package Jobsheet13.Assignment;

import Jobsheet13.Student;

public class AssignmentDoubleLinkedList {
    Node head;
    Node tail;
    
    // Constructor
    AssignmentDoubleLinkedList(){
        head = null;
        tail = null;
    }
    
    // Existing methods (keeping original functionality)
    boolean isEmpty(){
        return head == null;
    }
    
    void addFirst(Jobsheet13.Assignment.Student26 data){
        Node newNode = new Node();
        if(isEmpty()){
            head = tail = newNode;
        }else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
    
    void addLast(Jobsheet13.Assignment.Student26 data){
        Node newNode = new Node();
        if(isEmpty()){
            head = tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }
    
    void insertAfter(String key, Student data){
        Node newNode = new Node(data);
        Node temp = head;
        while(temp != null){
            if(temp.data.nim.equalsIgnoreCase(key)){
                if(temp == tail){
                    addLast(null);
                }else{
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                return;
            }
            temp = temp.next;
        }
        System.out.println("Insertion failed. Data ("+key+") not found!!");
    }
    
    void removeFirst(){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            head = head.next;
            head.prev = null;
        }
    }
    
    void removeLast(){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
        }else if(head == tail){
            head = tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
        }
    }
    
    void remove(int index){
        if(isEmpty()){
            System.out.println("Double linked list is currently empty!!");
            return;
        }
        if(index < 0){
            System.out.println("Index cannot be negative!");
            return;
        }
        if(index >= getSize()){
            System.out.println("Index exceeds list size!");
            return;
        }
        
        if(index == 0){
            removeFirst();
        }else{
            Node temp = head;
            for(int i=0; i<index; i++){
                temp = temp.next;
            }
            if(temp == tail){
                removeLast();
            }else{
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
                return;
            }
        }
    }
    
    void print(){
        if(!isEmpty()){
            Node temp = head;
            while(temp != null){
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        }else{
            System.out.println("Double linked list is currently empty!!");
        }
    }
     // ========== ASSIGNMENT METHODS ==========
    
    // Assignment 1: Add function to insert node at specific index
    void add(Jobsheet13.Assignment.Student26 data, int index) {
        if(index < 0) {
            System.out.println("Index cannot be negative!");
            return;
        }
        
        if(index == 0) {
            addFirst(data);
            return;
        }
        
        if(index >= getSize()) {
            Jobsheet13.Assignment.Student26 Student = null;
            addLast(Student);
            return;
        }
        
        Node newNode = new Node();
        Node temp = head;
        
        // Navigate to the position
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        
        // Insert before temp
        newNode.next = temp;
        newNode.prev = temp.prev;
        temp.prev.next = newNode;
        temp.prev = newNode;
    }
    
    // Assignment 2: Remove node after specified key
    void removeAfter(String key) {
        if(isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }
        
        Node temp = head;
        while(temp != null) {
            if(temp.data.nim.equalsIgnoreCase(key)) {
                if(temp.next == null) {
                    System.out.println("No node exists after the specified key!");
                    return;
                }
                
                Node nodeToRemove = temp.next;
                if(nodeToRemove == tail) {
                    removeLast();
                } else {
                    temp.next = nodeToRemove.next;
                    nodeToRemove.next.prev = temp;
                }
                System.out.println("Node after (" + key + ") has been removed.");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key (" + key + ") not found!");
    }
    
    // Assignment 3: Get methods
    Student getFirst() {
        if(isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return head.data;
    }
    
    Student getLast() {
        if(isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        return tail.data;
    }
    
    Student getIndex(int index) {
        if(isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return null;
        }
        
        if(index < 0 || index >= getSize()) {
            System.out.println("Index out of bounds!");
            return null;
        }
        
        Node temp = head;
        for(int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }
    
    // Assignment 4: Get size method
    int getSize() {
        int count = 0;
        Node temp = head;
        while(temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    // Assignment 5: Get index of specific data by key (nim)
    int indexOf(String nim) {
        Node temp = head;
        int index = 0;
        
        while(temp != null) {
            if(temp.data.nim.equalsIgnoreCase(nim)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; // Not found
    }
}

