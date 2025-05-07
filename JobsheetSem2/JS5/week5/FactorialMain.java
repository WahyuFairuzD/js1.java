package week5;

import java.util.Scanner;

public class FactorialMain {
     public static void main(String[] args) { // main function
        Scanner sc = new Scanner(System.in); 
      
        
        System.out.print("Input a number: ");
       int num = sc.nextInt();             
        
       Factorial factorial = new Factorial();                
        System.out.println("Factorial of " + num + " using Brute Force: " + factorial.faktorialBF(num));
        System.out.println("Factorial of " + num + " using Divide and Conquer: " + factorial.faktorialDC(num));
    }
}

