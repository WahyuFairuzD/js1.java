package Alg.JS2;
import java.util.Scanner;

public class ArrayTime {
    public static void main(String[] args) {
        String course[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        int credit[] = {3, 3, 2};
        String grade[] = new String[credit.length];

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < credit.length; i++) {
            System.out.print("Masukkan nilai huruf untuk " + course[i] + ": ");
            grade[i] = scanner.nextLine().toUpperCase();
        }

        System.out.println("Calculate final grade");
        double sum = 0, totalCredit = 0;

        for (int i = 0; i < credit.length; i++) {
            double numGrade = 0;
            switch (grade[i]) {
                case "A":
                    numGrade = 4.0;
                    break;
                case "B+":
                    numGrade = 3.5;
                    break;
                case "B":
                    numGrade = 3.0;
                    break;
                case "C+":
                    numGrade = 2.5;
                    break;
                case "C":
                    numGrade = 2.0;
                    break;
                case "D":
                    numGrade = 1.0;
                    break;
                case "E":
                    numGrade = 0.0;
                    break;
                default:
                    System.out.println("Invalid grade for " + course[i]);
                    continue;
            }

            sum += numGrade * credit[i];
            totalCredit += credit[i];
        }

        scanner.close();

        double finalGrade = sum / totalCredit;
        String letterGrade;

        if (finalGrade >= 85) {
            letterGrade = "A";
        } else if (finalGrade >= 75) {
            letterGrade = "B+";
        } else if (finalGrade >= 65) {
            letterGrade = "B";
        } else if (finalGrade >= 55) {
            letterGrade = "C+";
        } else if (finalGrade >= 45) {
            letterGrade = "C";
        } else if (finalGrade >= 30) {
            letterGrade = "D";
        } else {
            letterGrade = "E";
        }

        System.out.println("==============================");
        System.out.printf("Nilai akhir : %.1f\n", finalGrade * 25); // Konversi skala 4 ke 100
        System.out.println("Nilai Huruf : " + letterGrade);

        if (finalGrade >= 2.0) {
            System.out.println("SELAMAT ANDA LULUS");
        } else {
            System.out.println("ANDA TIDAK LULUS");
        }
        System.out.println("==============================");
    }
}
