package jobsheet12;
import java.util.Scanner;
public class SLLMain26 { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      
        // 1. Membuat objek SingleLinkedList
        SingleLinkedList26 sll = new SingleLinkedList26();

        // 2. Membuat objek Student
        Student26 std1 = new Student26("001", "Student 1", "TI-1I", 3.89);
        Student26 std2 = new Student26("002", "Student 2", "TI-1I", 3.45);
        Student26 std3 = new Student26("003", "Student 3", "TI-1I", 3.20);
        Student26 std4 = new Student26("004", "Student 4", "TI-1I", 3.00);
         
        // answer question number 3 to modify for can be bale input by keyboard
         System.out.println("Enter student data:");
        System.out.print("NIM: ");
        String nim = sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Class: ");
        String cls = sc.nextLine();
        System.out.print("GPA: ");
        double gpa = sc.nextDouble();
        // 3. Menambahkan student ke linked list
        sll.addFirst(std4);
        sll.addLast(std1);
        sll.insertAfter(std3, "Student 4");
        sll.insertAt(2, std2);

        // 4. Mencetak data awal
        sll.print();

        // ======== Mulai dari sini adalah kode poin ke-8 eksperimen 2 ========
        System.out.println("Data at index 1 is:");
        Student26 data = sll.getData(1);
        data.print();

        int idx = sll.indexOf("Student 1");
        System.out.println("Student 1 is located at index: " + idx);

        sll.removeFirst(); // Hapus elemen pertama
        sll.removeLast();  // Hapus elemen terakhir
        sll.print();       // Cetak isi linked list

        sll.removeAt(0);   // Hapus berdasarkan index ke-0
        sll.print();       // Cetak isi linked list
        // ======== Akhir kode poin ke-8 eksperimen 2 ========
    }
}
