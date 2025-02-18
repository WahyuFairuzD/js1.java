package JS1;
import java.util.Scanner;

public class Assignment2 {

    // tampilan menu
    public static int tampilkanMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPilih perhitungan yang ingin dilakukan:");
        System.out.println("1. Hitung Volume Kubus");
        System.out.println("2. Hitung Luas Permukaan Kubus");
        System.out.println("3. Hitung Keliling Kubus");
        System.out.print("Masukkan pilihan (1-3): ");
        int pilihan = scanner.nextInt();
        return pilihan;
    }

    //buatngitung volume kubus
    public static int hitungVolume(int sisi) {
        return sisi * sisi * sisi;
    }

    //buat ngitung luas permukaan
    public static int hitungLuasPermukaan(int sisi) {
        return 6 * sisi * sisi;
    }

    // untuk ngitung keliling kubus
    public static int hitungKeliling(int sisi) {
        return 12 * sisi;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang sisi kubus: ");
        int sisi = scanner.nextInt();

        int pilihan = tampilkanMenu();

        switch (pilihan) {
            case 1:
                System.out.println("Volume kubus: " + hitungVolume(sisi));
                break;
            case 2:
                System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                break;
            case 3:
                System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}