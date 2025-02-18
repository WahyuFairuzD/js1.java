package JS1;
import java.util.Scanner;
public class ArrayTime {
    public static void main(String[] args) {
        String course[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int credit[] = { 3,3,2};
        String grade[]= {"A","B+","A"};
        System.out.println("Calculate final grade");
        double sum=0, totalCredit=0;
        for (int i = 0; i< course.length; i++){
            double numGrade = 0;
            switch (grade[i]) {
                case "A":
                    numGrade=4.0;                    
                    break;
                    case "B+":
                    numGrade=3.5;
                    break;
                    case "B":
                    numGrade=3.0;
                    break;
                    case"C+":
                    numGrade=2.5;
                    break;
                    case "C":
                    numGrade=2.0;
                    break;
                    case"D":
                    numGrade=1.0;
                    break;
                    case"E":
                    numGrade=0.0;
                    break;
                    default:
                    System.out.println("invalid"+ course[i]);



            
                
            }

        }
        
    }
}