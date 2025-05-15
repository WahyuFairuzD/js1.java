package jobsheet12;

import java.util.Scanner;

public class Assignment26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentQueue26 queue = new StudentQueue26();

        while (true) {
            System.out.println("-----Student Service Queue----");
            System.out.println("1.Register Student");
            System.out.println("2. Call Next Student");
            System.out.println("3.Check if the Queue is empty");
            System.out.println("4. Check if the queue is full");
            System.out.println("5. SHow front and rear");
            System.out.println("6. Show all students");
            System.out.println("7. Show total Students");
            System.out.println("8. Clear queue");
            System.out.println("0.Exit");
            System.out.print(" Choose Menu :");

            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Class: ");
                    String cls = sc.nextLine();
                    System.out.print("GPA: ");
                    double gpa = sc.nextDouble();
                    sc.nextLine(); // flush newline
                    queue.enqueue(new Student26(nim, name, cls, gpa));
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
                    break;
                case 4:
                    System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
                    break;
                case 5:
                    queue.printFrontRear();
                    break;
                case 6:
                    queue.printAll();
                    break;
                case 7:
                    System.out.println("Total students in queue: " + queue.total());
                    break;
                case 8:
                    queue.clear();
                    break;
                case 0:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid menu!");
            }
        }
    }
}