 package week5;                     
import java.util.Scanner;

public class Factorial {
    
    public int faktorialBF(int n) {
        int facto = 1;
        for (int i = 1; i <= n; i++) {
            facto = facto * i;
        }
        return facto;
    }

    public int faktorialDC(int n) {
        if (n == 1) {
            return 1;
        } else {
            int facto = n * faktorialDC(n - 1);
            return facto;         
        }
    }}