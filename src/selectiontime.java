import java.util.Scanner;

public class selectiontime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Masukkan Nilai Tugas : ");
            double nilaiTugas = sc.nextInt();
            System.out.print("Masukkan Nilai Kuis : ");
            double nilaiKuis = sc.nextInt();
            System.out.print("Masukkan Nilai UTS : ");
            double nilaiUts = sc.nextInt();
            System.out.print("Masukkan Nilai UAS : ");
            double nilaiUas = sc.nextInt();
            boolean lulus;
            String grade;

            if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUts < 0 || nilaiUts > 100 || nilaiUas < 0 || nilaiUas > 100) {
                System.out.println("================================");
                System.out.println("Nilai tidak valid, silakan masukkan kembali.");
                System.out.println("================================");
                break;
            } else {
                double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUts * 0.3) + (nilaiUas * 0.3);
                if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
                    grade = "A";
                    lulus = true;
                } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
                    grade = "B+";
                    lulus = true;
                } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
                    grade = "B";
                    lulus = true;
                } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
                    grade = "C+";
                    lulus = true;
                } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
                    grade = "C";
                    lulus = true;
                } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
                    grade = "D";
                    lulus = false;
                } else {
                    grade = "E";
                    lulus = false;
                }

                System.out.println("================================");
                System.out.println("Nilai Akhir: " + nilaiAkhir);
                System.out.println("Grade: " + grade);
                System.out.println("================================");

                if (lulus) {
                    System.out.println("SELAMAT ANDA LULUS");
                } else {
                    System.out.println("ANDA TIDAk LULUS");
                }

                System.out.println("================================");
            }
        }
        sc.close();
    }
}