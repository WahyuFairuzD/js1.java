package Jobsheet10;

import java.util.Scanner;

import jobsheet12.Student26;

public class StudentDemo6 {
    public static void main(String[] args) {
        StudentAssignmentStack stack = new StudentAssignmentStack(5);
        Scanner input = new Scanner(System.in);

        int pilih = 0;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan Tugas");
            System.out.println("2. Menilai Tugas");
            System.out.println("3. Meloihat Tugas Teratas");
            System.out.println("4. Melihat Daftar Tugas");
            System.out.print("Pilih: ");
            int choose = input.nextInt();
            input.nextLine();
            switch (choose) {
                case 1:
                    System.out.println("Name: ");
                    String nama = input.nextLine();
                    System.out.println("NIM: ");
                    String nim = input.nextLine();
                    System.out.println("Class: ");
                    String kelas = input.nextLine();
                    Student26 std = new Student26(nama, nim, kelas, choose);
                    stack.push(std);
                    System.out.printf("Task %s success to submit\n", std.name);
                    break;
                case 2:
                Student26 Dinilai = stack.pop();
                if (Dinilai != null) {
                    System.out.println("Task %s success to evaluate\n");
                    System.out.print("Give a score: ");
                    Scanner scan = null;
                    int nilai = scan.nextInt();
                    input.nextLine();
                    Dinilai.tugasDInilai(nilai);
                    System.out.printf("Task %s success to evaluate\n", Dinilai.name);
                } 
                break;
                case 3:
                Student26 lihat = stack.peek();
                if (lihat != null) {
                    System.out.println("tugas terakhir dikumpulkan oleh " + lihat.name);
                }
                break;
                case 4:
                System.out.println("Daftar semua tugas");
                System.out.println("Nama/tNIM/tKelas");
                stack.print();
                break;
            
                default:
                System.out.println("Invalid choose");
                    break;
            }
        } while (pilih >= 1 && pilih <= 4);

    }}
    

