package Jobsheet13.Assignment;

public class DoubleLinkedListsAssignmentTest {
    public static void main(String[] args) {
        AssignmentDoubleLinkedList dll = new AssignmentDoubleLinkedList();
        
        System.out.println("=== Testing Assignment Methods ===");
        
        // Add some initial data
        dll.addFirst(new Student26("111", "Anton", "TI-1I", 3.57));
        dll.addFirst(new Student26("112", "Prabowo", "TI-1I", 3.7));
        dll.addLast(new Student26("113", "Herco", "TI-1I", 3.89));
        
        System.out.println("Initial list:");
        dll.print();
        
        // Test Assignment 1: add(data, index)
        System.out.println("=== Testing add(data, index) ===");
        dll.add(new Student26("114", "Rizki", "TI-1I", 3.8), 1);
        System.out.println("After adding Rizki at index 1:");
        dll.print();
        
        dll.add(new Student26("115", "Hanzel", "TI-1I", 3.6), 0);
        System.out.println("After adding Hanzel at index 0:");
        dll.print();
        
        dll.add(new Student26("116", "Eiyu", "TI-1I", 3.4), 10); // Beyond size
        System.out.println("After adding Eiyu at index 10 (beyond size):");
        dll.print();
        
        // Test Assignment 2: removeAfter(key)
        System.out.println("=== Testing removeAfter(key) ===");
        dll.removeAfter("111");
        System.out.println("After removing node after '111':");
        dll.print();
        
        dll.removeAfter("999"); // Non-existent key
        dll.removeAfter("116"); // Last node (no next)
        
        // Test Assignment 3: get methods
        System.out.println("=== Testing get methods ===");
        Object first = dll.getFirst();
        if(first != null) {
            System.out.print("First student: ");
            ((Student26) first).print();
        }
        
        Object last = dll.getLast();
        if(last != null) {
            System.out.print("Last student: ");
            ((Student26) last).print();
        }
        
        Object atIndex2 = dll.getIndex(2);
        if(atIndex2 != null) {
            System.out.print("Student at index 2: ");
            ((Student26) atIndex2).print();
        }
        
        // Test Assignment 4: getSize()
        System.out.println("=== Testing getSize() ===");
        System.out.println("List size: " + dll.getSize());
        
        // Test Assignment 5: indexOf(nim)
        System.out.println("=== Testing indexOf(nim) ===");
        System.out.println("Index of '112': " + dll.indexOf("112"));
        System.out.println("Index of '113': " + dll.indexOf("113"));
        System.out.println("Index of '999': " + dll.indexOf("999")); // Not found
        
        System.out.println("\nFinal list:");
        dll.print();
    }
}
