import java.util.Scanner;

public class MainStudent26 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudent26 data = new SearchStudent26();
        System.out.print("enter number of student: ");
        int amountStd = s.nextInt();

        System.out.println("-------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStd; i++) {
            System.out.println("----------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name\t:");
            String name = s1.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            s.nextLine();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();
            s.nextLine();

            Students26 std = new Students26();
            data.add(std);
        }

        System.out.println("-------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("_________________________");
        System.out.println("_________________________");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);
        data.showPosition(search, position);
        data.showData(search, position);

        System.out.println("========================="); //ADDITION FOR 7.3
        System.out.println("Search student by NIM: ");
        System.out.println("Using Binary Search");
        int position1 = data.FindBinarySearch(search, 0, amountStd-1);
        data.showPosition(search, position1); //ADDITION FOR 7.3
        data.showData(search, position1);

        s.close();
        s1.close();
    }
}