package JobsheetSem2.P1Jobsheet11;
import java.util.Scanner;

public class QueueMain26 {
    public static void menu() {
        System.out.println("Available menu:");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Clear");
        System.out.println("5. Exit");
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input maximum number of data: ");
        int n = sc.nextInt();

        Queue26 Q = new Queue26(n);

        int choice;
        do {
            menu();
            System.out.print("Select menu: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Input new data: ");
                    int newData = sc.nextInt();
                    Q.enqueue(newData);
                    break;
                case 2:
                    int outData = Q.dequeue();
                    if (outData != 0) {
                        System.out.println("Removed data: " + outData);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.clear();
                    break;
                case 5:
                    System.out.println("Program finished.");
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        } while (choice != 5);
        sc.close();
    }
}
