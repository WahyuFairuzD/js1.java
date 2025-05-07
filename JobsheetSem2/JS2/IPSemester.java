package Alg.JS2;
import java.util.Scanner;

public class IPSemester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] mataKuliah = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"
        };

        double[] nilaiAngka = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        int[] sks = {2, 3, 3, 4, 2, 3, 3, 2};

        // Input nilai untuk setiap mata kuliah
        for (int i = 0; i < mataKuliah.length; i++) {
            while (true) {
                System.out.print("Masukkan nilai Angka untuk MK " + mataKuliah[i] + ": ");
                double nilai = sc.nextDouble();
                if (nilai >= 0 && nilai <= 100) {
                    nilaiAngka[i] = nilai;
                    break;
                } else {
                    System.out.println("Nilai tidak valid. Masukkan angka antara 0-100.");
                }
            }
        }

        // Konversi nilai angka ke huruf dan bobot nilai
        String[] nilaiHuruf = new String[mataKuliah.length];
        double totalBobotSKS = 0;
        int totalSKS = 0;

        for (int i = 0; i < mataKuliah.length; i++) {
            double nilai = nilaiAngka[i];
            if (nilai > 80) {
                nilaiHuruf[i] = "A";
                bobotNilai[i] = 4.0;
            } else if (nilai > 73) {
                nilaiHuruf[i] = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai > 65) {
                nilaiHuruf[i] = "B";
                bobotNilai[i] = 3.0;
            } else if (nilai > 60) {
                nilaiHuruf[i] = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai > 50) {
                nilaiHuruf[i] = "C";
                bobotNilai[i] = 2.0;
            } else if (nilai > 39) {
                nilaiHuruf[i] = "D";
                bobotNilai[i] = 1.0;
            } else {
                nilaiHuruf[i] = "E";
                bobotNilai[i] = 0.0;
            }

            totalBobotSKS += bobotNilai[i] * sks[i];
            totalSKS += sks[i];
        }

        double ip = totalBobotSKS / totalSKS;

        // Menampilkan hasil konversi nilai
        System.out.println("\n========================================");
        System.out.println("hasil Konversi Nilai");
        System.out.println("----------------------------------------");
        System.out.printf("%-40s %-12s %-10s %-10s%n", "MK", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("%-40s %-12.2f %-10s %-10.2f%n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], bobotNilai[i]);
        }

        System.out.println("----------------------------------------");
        System.out.printf("IP : %.2f%n", ip);
        System.out.println("========================================");

        sc.close();
    }
} 
