import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
    
    }
  }
    Scanner s = new Scanner(System.in);
    Scanner s1 = new Scanner(System.in);

    SearchStudents data = new SearchStudents();
    int amountStudent = 5;

    
    System.out.println("------------------");
    System.out.println("Welcome to Student Search");
    for (int i = 0; i < amountStudents; i++) {
        System.out.println("------");
        System.out.println("NIM\t:");
        int nim = s.nextInt();
        System.out.println("name\t:");
        String name = s1.nextLine();
        System.out.println("Age\t:");
        int age = s.nextInt();
        System.out.println("GPA\t:");
        double gpa = s.nextDouble();  
        
        Students std = new Students(nim, name, age, gpa);
        data.add(std); 
      
          System.out.println("------");
          System.out.println("------");
          System.out.println("Search Student");
          int search = s.nextInt();
          System.out.println("Using sequential search");
          int position = data.findSeqSearch(search);

          data.showPosition(search, position);
          data.showData(search, position);
     
    }