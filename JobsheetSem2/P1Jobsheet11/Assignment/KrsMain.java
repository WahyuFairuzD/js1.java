package JobsheetSem2.P1Jobsheet11.Assignment;


import java.util.Scanner;

public class KrsMain {
    public void menu() {
        System.out.println("\nMenu: ");
        System.out.println("1. Add Students");
        System.out.println("2. Process KRS (2 Students)");
        System.out.println("3. View All Students");
        System.out.println("4. Clear Queue");
        System.out.println("5. View the first two students");
        System.out.println("6. View the last students");
        System.out.println("7. Show KRS Statistics");
        System.out.println("0. Exit");
        System.out.print("Choose: ");
    }

    public static void main(String[] args) {
        Scanner sigmaSkibidi = new Scanner(System.in);
        KrsMain krs = new KrsMain();
        KrsQueue queue = new KrsQueue();
        int choice = 0;
        do {
            krs.menu();
            choice = sigmaSkibidi.nextInt();
            switch (choice) {
                case 1:
                    sigmaSkibidi.nextLine();
                    System.out.print("Enter NIM: ");
                    String nim = sigmaSkibidi.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sigmaSkibidi.nextLine();
                    System.out.print("Enter Study Program: ");
                    String studyProgram = sigmaSkibidi.nextLine();
                    System.out.print("Enter Class: ");
                    String kelas = sigmaSkibidi.nextLine();
                    Krs dt =  Krs(nim, name, studyProgram, kelas);
                    queue.enqueue(dt);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    queue.clear();
                    break;
                case 5:
                    queue.displayFirstTwoStudents();
                    break;
                case 6:
                    queue.peekRear();
                    break;
                case 7:
                    queue.showStatistics();
                    break;
                case 0:
                    System.out.println("Thanks!!");
                    break;
                default:
                    System.out.println("Invalid menu!!");
            }

        } while (choice != 0);
    }
}