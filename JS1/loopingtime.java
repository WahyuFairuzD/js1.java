package JS1;
import java.util.Scanner;

public class loopingtime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        long num = sc.nextLong();
        long n = num % 100;
        
        if (n < 10) {
            n += 10;
        }

        System.out.println("================================");
        System.out.println("n : " + n);
        System.out.println("================================");

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            }

            if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }
       System.out.println();
        sc.close();
}
}